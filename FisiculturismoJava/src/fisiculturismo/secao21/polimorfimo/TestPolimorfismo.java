package fisiculturismo.secao21.polimorfimo;

public class TestPolimorfismo {
	public static void main(String[] args) {
		Animal dog = new Cachorro();
		Animal cat = new Gato();
		Animal horse = new Cavalo();
		
		dog.fazerSom();
		dog.tipoObjeto();
		cat.fazerSom();
		cat.tipoObjeto();
		horse.fazerSom();
		horse.tipoObjeto();
	}//end of main
}//end of class