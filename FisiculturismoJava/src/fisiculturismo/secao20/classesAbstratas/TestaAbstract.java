package fisiculturismo.secao20.classesAbstratas;

public class TestaAbstract {
	public static void main(String[] args) {
		CarroEsportivo esportivo = new CarroEsportivo();
		Caminhao caminhao = new Caminhao();
		
		caminhao.acelerar();
		caminhao.frear();
		
		esportivo.acelerar();
		esportivo.frear();
	}//end of main
}//end of class