package fisiculturismo.secao27.input_output_Nelio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program01Melhorado {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String caminhoAtual = System.getProperty("user.dir");
		
		File file = null;
		Scanner sc = null;
		
		//System.out.println( osName.toLowerCase());
		//System.out.println("O caminho de execução é:\n\n" + caminhoAtual+ "\n\n\n");
		
		try {
			file = new File(caminhoAtual + "/Exemplo01.txt");
			try {
				sc = new Scanner(file);
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}//end while
			}catch(IOException err) {
				System.out.println("Erro de leitura\n"+err.getMessage());
			}finally {
				if(sc != null) {
					sc.close();
				}//end if
			}//end of try/catch/finally
		}catch(Exception e) {
			System.out.println("Erro ao criar o arquivo\n" + e.getMessage());
		}//end of  try/catch
	}//end of main
}//end of class