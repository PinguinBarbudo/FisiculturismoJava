package fisiculturismo.secao19.interfaces;

public class TestaAnimais {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
		
		dog.fazerSom();
		cat.fazerSom();
		System.out.println(Animal.DESCRICAO);
	}
}//end of class