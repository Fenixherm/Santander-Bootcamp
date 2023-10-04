package pesquisaList.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	public static void main(String[] args) {
		SomaNumeros soma = new SomaNumeros();
		
		soma.adicionarNumero(50);
		soma.adicionarNumero(51);
		soma.adicionarNumero(52);
		soma.adicionarNumero(53);
		
		System.out.println(soma.exibirNumeros());
	}
	

	private List<Integer> listaDeNumeros;
	

	public SomaNumeros() {
		listaDeNumeros = new ArrayList<>();
	}
	
	void adicionarNumero(int numero) {
		listaDeNumeros.add(numero);
	}
	
	int calcularSoma() {
		int resultado = 0;
		for(int i : listaDeNumeros) {
			resultado = resultado + i;
		}
		return resultado;
	}
	
	void encontrarMaiorNumero() {
		
		for(int i : listaDeNumeros) {
			
		}
	}
	
	void encontrarMenorNumero() {
		
	}
	
	List<Integer> exibirNumeros() {
		return listaDeNumeros;
	}
}
