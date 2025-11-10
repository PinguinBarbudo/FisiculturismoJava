package fisiculturismo.secao20.classesAbstratas;

abstract public class Carro2 {
	
	private int peso;
	
	public Carro2(int peso) {
		this.peso = peso;
		descreve();
	}
	
	abstract void acelerar();
	abstract void frear();
	public void descreve() {
		System.out.println("Peso do carro: " + this.peso);
	}
}//end of class