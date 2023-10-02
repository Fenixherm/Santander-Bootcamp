package corrida;


public class Autodromo {
	public static void main(String[] args) {
		Carro R34 = new Carro();
		Moto R1 = new Moto();
		
		//R34.confereCombustível();
		R34.setChassi("448535");
		R34.ligar();
		R1.setChassi("454565");
		
		Veiculo generico = R34;
		
		generico.ligar();
	}
}
