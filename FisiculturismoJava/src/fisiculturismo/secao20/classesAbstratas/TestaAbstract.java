package fisiculturismo.secao20.classesAbstratas;

public class TestaAbstract {
	public static void main(String[] args) {
		CarroEsportivo esportivo = new CarroEsportivo();
		Caminhao caminhao = new Caminhao();
		CarroComum comum = new CarroComum(5);
		
		caminhao.acelerar();
		caminhao.frear();
		
		esportivo.acelerar();
		esportivo.frear();
		
		comum.acelerar();
		comum.frear();
	}//end of main
}//end of class