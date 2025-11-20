package fisiculturismo.secao27.input_output_serializacao.exercicios;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EscreverNoArquivo {
	
	public Boolean Escreve(String caminho, String mensagem) {
		Boolean salvou = false;
		
		try {
			
			LocalDateTime agora = LocalDateTime.now();
			DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			
			String dataFormatada = agora.format(formater);
			
			FileWriter write = new FileWriter(caminho);
			write.write(dataFormatada + "\n\n" + mensagem);
			write.close();
			salvou = true;
		}catch(Exception e) {
			salvou = false;
			System.out.println("Erro ao escrever o arquivo:\n" + e.getMessage());
		}
		
		return salvou;
	}//end of Escreve
	
}//end of class