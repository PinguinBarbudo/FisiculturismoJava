package fisiculturismo.secao27.input_output_serializacao.exercicios;

public class ExemploIO {
	
	public static void main(String[] args) {
		EscreverNoArquivo escreve = new EscreverNoArquivo();
		LerDoArquivo leitura = new LerDoArquivo();
		System.out.println("Escreveu o arquivo? " +  escreve.Escreve("Exercicio01.txt",
				"Esse é o primeiro exercício utilizando OO e IO\nBem vindo ao java"));
		
		System.out.println("\n\n******* INICIANDO LEITURA *******\n\n");
		System.out.println(leitura.leitura("Exercicio01.txt"));
		
		System.out.println("\n\n******* FIM DA EXECUÇÃO *******\n\n");
		
	}//end of main
	
}//end of class