package fisiculturismo.secao27.input_output_serializacao.exercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerDoArquivo {
	
	public String leitura(String caminho) {
		String mensagem = "";
		int data = 0;
		
		try {
			FileReader reader = new FileReader(caminho);
			data = reader.read();
			
			while(data != -1) {
				mensagem += (char)data;
				data = reader.read();
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			mensagem = "\n\n\n*********Erro*********\n\n\n";
			System.out.println("Erro de caminho não encontrado:\n" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Erro de leitura:\n" + e.getMessage());
		}
		
		
		return mensagem;
	}//end of leitura
	
}//end of class