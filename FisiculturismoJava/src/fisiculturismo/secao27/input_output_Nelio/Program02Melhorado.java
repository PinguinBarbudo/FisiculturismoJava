package fisiculturismo.secao27.input_output_Nelio;

import java.io.BufferedReader;
import java.io.FileReader;

//utilizando o try with resources

public class Program02Melhorado {
	
	public static void main(String[] args) {
		String caminhoAtual = System.getProperty("user.dir");
		
		caminhoAtual += "/Exemplo02.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoAtual))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(Exception e) {
			System.out.println("Erro ao acessar arquivo:\n" + e.getMessage());
		}
	}//end of main
	
}//end of class