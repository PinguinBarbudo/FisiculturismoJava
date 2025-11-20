package fisiculturismo.secao27.inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoUmArquivo {
	public static void main(String[] args) {
		FileWriter writer;
		FileReader reader;
		
		try {
			writer = new FileWriter("Fisiculturismo19112024A.txt");
			System.out.println("O arquivo foi criado");
			writer.write("18 de novembro de 2025\nPrimeiro arquivo escrito em java pelo input/output");
			System.out.println("Algo foi escrito no arquivo");
			writer.close();
		} catch (IOException e) {
			System.out.println("Erro de criação de arquivo\n"+ e.getMessage());
		}//try/catch
		
		
		
		try {
			reader = new FileReader("Fisiculturismo19112024A.txt");
			int data = reader.read();//ler
			System.out.println("Leitura do Arquivo com um while:");
			while(data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Erro de leitura de arquivo\n"+ e.getMessage());
		} catch (IOException e) {
			System.out.println("Erro depois de criar arquivo\n"+ e.getMessage());
		}//end of try/catch/catch
		
		
	}//end of main
}//end of class