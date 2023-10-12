package map.pesquisa.contagem;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	Map<String, Integer> contadorPalavras;
	
	public ContagemPalavras() {
		contadorPalavras = new HashMap<>();
	}
	
	void adicionarPalavra(String palavra, Integer contagem) {
		contadorPalavras.put(palavra, contagem);
	}
	
	void removerPalavra(String palavra) {
		contadorPalavras.remove(palavra);
	}
	
	void exibirContagemPalavras(){
		System.out.println(contadorPalavras);
		System.out.println(contadorPalavras.values());
	}
	
	/**
	 * Este método faz a busca da palavra mais frequente. 
	 *  É utilizado um for utilizando Map.Entry para acessar a chave e o valor
	 *  do map. É feita a comparação do value com a maiorContagem, assim é retornado
	 *  uma key e um value, baseado na maiorContagem.
	 */
	Map<String, Integer> encontrarPalavraMaisFrequente() {
		Integer maiorContagem = Integer.MIN_VALUE;
		Map<String, Integer> contador = new HashMap<>();
		String palavraMaisFrequente = null;
		if(!contadorPalavras.isEmpty()) {
			for(Map.Entry<String, Integer> map : contadorPalavras.entrySet()) {
				if(map.getValue() > maiorContagem) {
					maiorContagem = map.getValue();
					palavraMaisFrequente = map.getKey();
				}
			}
			contador.put(palavraMaisFrequente, maiorContagem);
		}
		return contador;
	}
	
	public static void main(String[] args) {
		ContagemPalavras contador = new ContagemPalavras();
		
		contador.adicionarPalavra("Jovem", 20);
		contador.adicionarPalavra("Sim", 15);
		contador.adicionarPalavra("legal", 50);
		contador.adicionarPalavra("Humano", 35);
		
		contador.exibirContagemPalavras();
		System.out.println(contador.encontrarPalavraMaisFrequente());
	}
}
