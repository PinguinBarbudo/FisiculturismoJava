package fisiculturismo.secao22.generics;

public class Caixa <T>{
	private T coisasNaCaixa;
	
	public void guardar(T coisa) {
		this.coisasNaCaixa = coisa;
	}
	
	public T pegar() {
		return coisasNaCaixa;
	}
}//end of caixa textos