package fisiculturismo.secao25.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeiroLambda {
	public static void main(String[] args) {
		List<Integer> listaDeNumeros = new ArrayList<Integer>();
		listaDeNumeros.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		//Exemplo sem função  lambda
		for (Integer elemento : listaDeNumeros) {
			System.out.println(elemento);
		}
		
		//exemplo de código com função lambda
		listaDeNumeros.forEach((Integer numero) -> System.out.println(numero));
		
	}//end of main
}//end of class