package fisiculturismo.secao27.input_output_Nelio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * Udemy
 * Curso Java
 * Professor: Nelio Alves
 * Caruaru - PE
 * 19 de novembro de 2025
 * Estudo sobre input/output
 * D:\\NelioAlves\\Exemplo.txt
 * 
 */

public class Program01 {
	public static void main(String[] args) {
		File file = new File("d:\\NelioAlves\\Exemplo01.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Erro:\n" + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}//end of main
	
}//end of class