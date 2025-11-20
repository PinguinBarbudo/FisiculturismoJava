package fisiculturismo.secao27.inputOutput;

public class TreinoIntToChar {
	public static void main(String[] args) {
		int num1 = 79;
		int num2 = 108;
		int num3 = 225;
		
		char letra1 = (char) num1;
		char letra2 = (char) num2;
		char letra3 = (char) num3;
		
		System.out.println("Numeros referentes a letras da tabela unicode");
		System.out.println("Número 79: " + letra1);
		System.out.println("Número 108: " + letra2);
		System.out.println("Número 225: " + letra3);
		System.out.println("" + letra1 + letra2 + letra3 +", bem vindo ao java");
	}//end of main
}//end of class