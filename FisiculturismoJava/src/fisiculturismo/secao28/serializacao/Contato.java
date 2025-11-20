package fisiculturismo.secao28.serializacao;

/* 
 * Udemy
 * Curso Java Moderno, Fácil de Seguir,
 * com Spring Boot e Projetos
 * Professor: Arnaldo Sousa
 * Caruaru - PE
 * 19 de novembro de 2025
 * 
 */

import java.io.Serializable;

public class Contato implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String telefone;
	
	public Contato(String initNome, String initTelefone) {
		this.nome = initNome;
		this.telefone = initTelefone;
	}//end of constructor

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}//end of class