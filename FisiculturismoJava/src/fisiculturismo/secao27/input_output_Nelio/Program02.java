package fisiculturismo.secao27.input_output_Nelio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program02 {
	public static void main(String[] args) {
		//encontra o comainho do arquivo
		//Nesse exemplo será usado o arquivo 02
		
		//primeiro pegar o caminho onde o arquivo está
		String caminhoAtual = System.getProperty("user.dir");
		
		caminhoAtual += "/Exemplo02.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(caminhoAtual);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}//end while
			
		}catch(Exception e) {
			System.out.println("Erro de leitura:\n" + e.getMessage());
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (IOException err) {
				System.out.println("Erro ao fechar streams\n" + err.getMessage());
			}
		}
		
	}//end of main
}//end of class