package fisiculturismo.secao22.generics;

public class TesteComGenerics {
	public static void main(String[] args) {
		//Caixa para guardar carrinhos
		CaixaGenerica<Carrinho> caixaDeCarrinhos = new CaixaGenerica<>();
		//Caixa para  guardar bonecos
		CaixaGenerica<Boneco> caixaDeBonecos = new CaixaGenerica<>();
		
		caixaDeCarrinhos.guardar(new Carrinho("Hot Wheels"));
		caixaDeBonecos.guardar(new Boneco("Dummy 13"));
		
		//não necessita de cast, pois o método já retorna um objeto do tipo certo
		Carrinho carrinho = caixaDeCarrinhos.pega();
		Boneco boneco = caixaDeBonecos.pega();
		
		System.out.println("Pegou um carrinho "+ carrinho.getModelo());
		System.out.println("Pegou um boneco " + boneco.getNome());
		
	}//end main
}//end of class