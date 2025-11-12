package fisiculturismo.secao22.generics;

/*
 * Esse é um exemplo de como seria uma
 * implementação sem o generics
 * exemplificando como o mesmo objetivo
 * era atingido antes da criação do generics
 * 2025 11 12
 */

public class CaixaDeBrinquedos {
	private Object coisaNaCaixa;
	
	public void guardar(Object coisa) {
		this.coisaNaCaixa = coisa;
	}//end of guardar
	
	public Object pegar() {
		return coisaNaCaixa;
	}
	
}//end of class