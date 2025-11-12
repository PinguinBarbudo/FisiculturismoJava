package fisiculturismo.secao22.generics;

public class TesteSemGenerics {
	public static void main(String[] args) {
		//criar uma caixa para guardar os carrinhos
		CaixaDeBrinquedos caixaDeCarrinhos = new CaixaDeBrinquedos();
		CaixaDeBrinquedos caixaDeBonecos = new CaixaDeBrinquedos();
		
		caixaDeCarrinhos.guardar(new Carrinho("Hot Wheels")); //polimorfismo sendo usado nessa criação
		caixaDeBonecos.guardar(new Boneco("Dummy 13"));
		
		//importante verificar o tipo do objeto antes de fazer o cast
		if(caixaDeCarrinhos.pegar() instanceof Carrinho) {
			Carrinho carrinho = (Carrinho) caixaDeCarrinhos.pegar();
			System.out.println(carrinho.getModelo());
		}else {
			System.out.println("O objetos não são compatíveis");
		}
		if(caixaDeBonecos.pegar() instanceof Boneco) {
			Boneco boneco = (Boneco) caixaDeBonecos.pegar();
			System.out.println(boneco.getNome());
		}else {
			System.out.println("O objetos não são compatíveis");
		}
	}//end of main
}//end of class