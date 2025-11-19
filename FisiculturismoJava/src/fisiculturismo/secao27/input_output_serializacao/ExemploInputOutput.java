package fisiculturismo.secao27.input_output_serializacao;
/*
 * É possível consultar a tabela unicode no site:
 * https://unicodelookup.com
 * obs.:
 * utilize o modelo de busca latin na caixa de seleção do site
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ExemploInputOutput {
	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String dataFormatada = agora.format(formater);
		
		FileWriter writer;
		try {
			writer = new FileWriter("meuArquivo.txt");
			writer.write("" + dataFormatada + "\n\nOlá, mundo!");
			
			writer.close();
			
			FileReader reader = new FileReader("meuArquivo.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);//convertendo da tabela unicode
				//System.out.print(data); //sem converter o arquivo serializado
				data = reader.read();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Erro de arquivo\nProblema de IO\n\n" + e.getMessage());
		}
		
		
	}//end main
}//end class