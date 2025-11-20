package fisiculturismo.secao27.input_output_serializacao;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploNewIO {
	public static void main(String[] args) {
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String dataFormatada = agora.format(formater) + "\n\nEsse é o tipo NIO\n\nOlá!";
		
		Path path = Paths.get("meuArquivo02.txt");
		
		try {
			//escrevendo um arquivo
			Files.write(path, dataFormatada.getBytes());
			
			//lendo um arquivo
			byte[] bytes = Files.readAllBytes(path);
			String content = new String(bytes);
			System.out.println(content);
			
		} catch (IOException e) {
			System.out.println("Erro de IO\n\n" + e.getMessage());
		}
	}//end of main
}//end of class