package fisiculturismo.secao23.collections;

import java.util.Set;
import java.util.HashSet;

public class ExemploSet {
	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<String>();
		
		//adicionando elementos
		conjunto.add("Java");
		conjunto.add("Python");
		conjunto.add("C++");
		conjunto.add("VBA");
		conjunto.add("HTML");
		
		//verifica se a lista tem um elemento específico
		System.out.println("Contém 'Java'? " + conjunto.contains("Java"));
		
		conjunto.add("JavaScript");
		conjunto.add("Lua");
		conjunto.add("Godot");
		
		//imprime lista completa
		System.out.println("Lista completa\n" + conjunto);
		
		//removendo um elemento
		conjunto.remove("Lua");
		
		System.out.println("Contém 'Lua'?" + conjunto.contains("Lua"));
		System.out.println("Lista após remoção:\n" + conjunto);
		
		//tentativa de adicionar um elemento repetido
		boolean foiAdicionado = conjunto.add("Python");
		System.out.println("Python foi adicionado? " + foiAdicionado);
		
		//limpando o conjunto
		conjunto.clear();
		System.out.println("Conjunto após comando clear: " + conjunto);
	}//end of class
}//end of class