package fisiculturismo.secao26.programacaoFuncional;

public class ExemploInterfaceFuncional {
	public static void main(String[] args) {
		InterfaceFuncional resultado = (a,b) -> a + b;
		
		System.out.println("Soma: " + resultado.calcular(10, 5));
		
		resultado = (a, b) -> a-b;
		System.out.println("Subtração: " + resultado.calcular(10, 5));
		
		resultado = (a, b) -> a*b;
		System.out.println("Multiplicação: " + resultado.calcular(10, 5));
		
		resultado = (a, b) -> a/b;
		System.out.println("Divisão: " + resultado.calcular(10, 5));
	}//end of main
}//end of class