package fisiculturismo.secao26.programacaoFuncional;

public class ExemploSemInterfaceFuncional {
	public double somar (double a, double b) { return a + b;}
	public double subtrair (double a, double b) { return a - b;}
	public double multiplicar (double a, double b) { return a * b;}
	public double dividir (double a, double b) { return a / b;}
	
	public static void main(String[] args) {
		ExemploSemInterfaceFuncional calculadora = new ExemploSemInterfaceFuncional();
		
		double resultado = calculadora.somar(10, 5);
		System.out.println("Soma: " + resultado);
		
		resultado = calculadora.subtrair(10, 5);
		System.out.println("Subtração: " + resultado);
		
		resultado = calculadora.multiplicar(10, 5);
		System.out.println("Multiplicação: " + resultado);
		
		resultado = calculadora.dividir(10, 5);
		System.out.println("Divisão: " + resultado);
	}//end of main
}//end of class