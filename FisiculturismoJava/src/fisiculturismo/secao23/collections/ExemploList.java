package fisiculturismo.secao23.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Java");
		lista.add("Python");
		lista.add("C++");
		lista.add("VBA");
		lista.add("Lua");
		
		System.out.println("Apresentando a lista completa: " + lista);
		System.out.println("Contém JavaScript? " + lista.contains("JavaScript"));
		
		List<String> outraLista = Arrays.asList("JavaScript", "Godot", "HTML", "CSS");
		lista.addAll(outraLista);
		
		System.out.println("Lista atualizada: " + lista);
		
		lista.remove("Lua");
		System.out.println("Lista atualizada: " + lista);
		System.out.println("6º elemento: " + lista.get(5));
		
	}//end of main
}//end of class