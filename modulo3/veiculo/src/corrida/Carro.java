package corrida;

//Observa que para o carro e a moto ter o Chassi novamente

// usa-se EXTENDS como forma de herança

// ou seja além das funções que o Carro possui,
//ele também possuí as funções do veículo
public class Carro extends Veiculo {
	
	public void ligar() {
		confereCombustivel();
		System.out.println("Carro Ligado!");
	}
	private void confereCombustivel() {
		System.out.println("Conferindo combustível");
	}
}