package ordenacaoList.ordernaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {
	public static void main(String[] args) {
		OrdenacaoNumeros lista = new OrdenacaoNumeros();
		
		lista.adicionarNumero(5);
		lista.adicionarNumero(8);
		lista.adicionarNumero(3);
		lista.adicionarNumero(7);
		lista.adicionarNumero(-25);
		
		System.out.println("Lista Ascendente" + lista.ordenarAscendente());
		System.out.println("Lista Descendente" + lista.ordenarDescendente());
	}
	
	
	private List<Integer> listaNumeros;
	
	OrdenacaoNumeros(){
		listaNumeros = new ArrayList<>();
	}
	
	void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	List<Integer> ordenarAscendente() {
		List<Integer> lista = new ArrayList<>(listaNumeros);
		if(!lista.isEmpty()) {
			Collections.sort(lista);
			return lista;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	List<Integer> ordenarDescendente() {
		List<Integer> lista = new ArrayList<>(listaNumeros);
		
		if(!lista.isEmpty()) {
			Collections.sort(lista, new ComparatorDescendente());
			return lista;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public void exibirNumeros() {
		if(!this.listaNumeros.isEmpty()) {
			System.out.println(this.listaNumeros);
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public int compareTo(Integer inteiro) {
		return Integer.compare(inteiro, inteiro);
	}
}
