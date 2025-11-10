package fisiculturismo.secao20.classesAbstratas;

public class CarroComum extends Carro2{

	public CarroComum(int peso) {
		super(peso);
	}

	@Override
	void acelerar() {
		System.out.println("Aceleração de um carro comum");
	}

	@Override
	void frear() {
		System.out.println("Frenagem de um carro comum");
	}
}//end of class