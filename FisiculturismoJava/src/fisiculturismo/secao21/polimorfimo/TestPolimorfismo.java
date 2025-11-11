package fisiculturismo.secao21.polimorfimo;

public class TestPolimorfismo {
	public static void main(String[] args) {
		Animal dog = new Cachorro();
		Animal cat = new Gato();
		Animal horse = new Cavalo();
		
		dog.fazerSom();
		cat.fazerSom();
		horse.fazerSom();
	}//end of main
}//end of class