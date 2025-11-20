package fisiculturismo.secao27.input_output_serializacao.exercicios;

public class ExemploNIO {
	
	public static void main(String[] args) {
		ManipulaTXT_NIO manipulaNIO = new ManipulaTXT_NIO();
		
		System.out.println("O arquivo foi criado?");
		
		System.out.println(manipulaNIO.escritaNIO("ExercicioNIO.txt", "Esse é um exemplo de arquivo escrito com a nova API NIO\n"
				+ "Essa API é mais moderna e tem uma boa vantagem de não bloquear o SO\n"
				+ "Portanto, não precisa fechar o método de escrita ou de leitura."));
		
		
		System.out.println(manipulaNIO.leituraNIO("ExercicioNIO.txt"));
	}//end of main
	
}//end of class