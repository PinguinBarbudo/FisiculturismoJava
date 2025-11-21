package fisiculturismo.secao27.input_output_Nelio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Program03 {
	public static void main(String[] args) {
		String[] lines = new String[] {"Daniela", "Heitor", "Nikolas", "Fabio"};
		String path = "Exemplo01.txt";
		String caminho = System.getProperty("user.dir");
		
		caminho += "/Exemplo01.txt";
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
				for(String line : lines) {
					bw.write(line);
					bw.newLine();
				}//end for
				System.out.println("Criado com sucesso");
		}catch(Exception e) {
			System.out.println("Erro ao criar arquivo\n" + e.getMessage());
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}catch(Exception e) {
			System.out.println("Erro de leitura\n" + e.getMessage());
		}
	}
}//end of class