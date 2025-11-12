package fisiculturismo.secao22.generics;

public class TestaCaixas {
	public static void main(String[] args) {
		Caixa<String> caixaDeTexto = new Caixa<>();
		Caixa<Integer> caixaDeNumeros = new Caixa<>();
		Caixa<Integer> caixaValueOf = new Caixa<>();
		
		Integer numero = Integer.valueOf(123);
		
		caixaDeTexto.guardar("Olá, mundo!");
		
		caixaDeNumeros.guardar(42);
		
		caixaValueOf.guardar(numero);
		
		System.out.println(caixaDeTexto.pegar());
		System.out.println(caixaDeNumeros.pegar());
		System.out.println(caixaValueOf.pegar());
	}//end of main
}//end of class