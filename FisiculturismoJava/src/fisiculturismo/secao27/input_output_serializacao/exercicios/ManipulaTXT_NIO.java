package fisiculturismo.secao27.input_output_serializacao.exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ManipulaTXT_NIO {
	
	public boolean escritaNIO(String caminho, String mensagem) {
		boolean escrito = false;
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String dataFormatada = agora.format(formater) + "\n\nEsse é o tipo NIO\n\nOlá!\n\n";
		
		dataFormatada += mensagem;
		
		try {
			Path path = Paths.get(caminho);
			Files.write(path, dataFormatada.getBytes());
			escrito = true;
		} catch (IOException e) {
			escrito = false;
			System.out.println("Esso ao criar/escrever arquivo\n\n" + e.getMessage());
		}
		
		return escrito;
	}//end of escritaNIO
	
	public String leituraNIO(String caminho) {
		String mensagem = "";
		
		Path path = Paths.get(caminho);
		
		try {
			byte[] bytes = Files.readAllBytes(path);
			mensagem = new String(bytes);
		} catch (IOException e) {
			mensagem = "Erro na leitura.";
			System.out.println("Erro de leitura de arquivo:\n" + e.getMessage());
		}
		
		
		return mensagem;
	}//end of leituraNIO
	
}//end of class