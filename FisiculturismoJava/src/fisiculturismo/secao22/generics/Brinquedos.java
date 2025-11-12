package fisiculturismo.secao22.generics;

public class Brinquedos {
	public static void main(String[] args) {
		Carrinho c = new Carrinho("Hot Wheels");
		Boneco b = new Boneco("Easy 13");
		
		System.out.println("Carrinho: " + c.getModelo());
		System.out.println("Boneco: " + b.getNome());
	}//end main
}//end of class