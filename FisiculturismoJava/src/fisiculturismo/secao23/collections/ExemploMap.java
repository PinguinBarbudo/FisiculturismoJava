package fisiculturismo.secao23.collections;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args) {
		Map<String, Integer> dicionario = new HashMap<>();
		
		dicionario.put("Java", 10);
		dicionario.put("Python", 11);
		dicionario.put("C++", 12);
		dicionario.put("Godot", 13);
		dicionario.put("JavaScript", 14);
		
		//verificando se o dicionario tem uma chave
		System.out.println("Coontém 'Java'? " + dicionario.containsKey("Java"));
		
		//Obtendo o valor associado a uma chave
		System.out.println("Valor associado a chve 'Java': " + dicionario.get("Java"));
		
		dicionario.put("HTML", 64);
		dicionario.put("CSS", 65);
		
		//imprime todo o conteúdo do dicionario sem ordenar
		System.out.println("Todos os itens do dicionário:\n" + dicionario);
		
		//removendo itens
		dicionario.remove("Python");
		dicionario.remove("C++");
		
		//mostrando o conteudo após remoção
		System.out.println("Conteúdo após remoção:\n" + dicionario);
		
		//modificando o valor de uma chave
		dicionario.put("Java", 2025);
		
		//Exibindo dicionario após mudar o valor de ma chave
		System.out.println("Valores atualizados:\n" + dicionario);
		
		//limpando todo o conteúdo
		dicionario.clear();
		
		System.out.println(dicionario);
		
		
	}//end of main
}//end of class