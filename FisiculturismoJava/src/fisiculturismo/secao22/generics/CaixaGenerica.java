package fisiculturismo.secao22.generics;

public class CaixaGenerica <T>{
	private T coisaNaCaixa;
	public void guardar(T coisa) {
		this.coisaNaCaixa = coisa;
	}
	public T pega() {
		return this.coisaNaCaixa;
	}
}//