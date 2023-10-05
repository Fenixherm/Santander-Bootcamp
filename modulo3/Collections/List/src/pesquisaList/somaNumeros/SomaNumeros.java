package pesquisaList.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	public static void main(String[] args) {
		SomaNumeros soma = new SomaNumeros();
		
		soma.adicionarNumero(-50);
		soma.adicionarNumero(-51);
		soma.adicionarNumero(-52);
		soma.adicionarNumero(-53);
		
		System.out.println(soma.exibirNumeros());
		System.out.println(soma.encontrarMaiorNumero());
		System.out.println(soma.encontrarMenorNumero());
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
	
	int encontrarMaiorNumero() {
		int maiorNumero = listaDeNumeros.get(0);
		for(int i : listaDeNumeros) {
			if(maiorNumero < i) {
				maiorNumero = i;
			}
		}
		return maiorNumero;
	}
	
	int encontrarMenorNumero() {
		int menorNumero = listaDeNumeros.get(0);
		for(int i : listaDeNumeros) {
			if(menorNumero > i) {
				menorNumero = i;
			}
		}
		return menorNumero;
	}
	
	List<Integer> exibirNumeros() {
		return listaDeNumeros;
	}
}
