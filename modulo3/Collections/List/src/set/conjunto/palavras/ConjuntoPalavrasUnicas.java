package set.conjunto.palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
		
		palavrasUnicas.adicionarPalavra("Cachorro");
		palavrasUnicas.adicionarPalavra("Gato");
		palavrasUnicas.adicionarPalavra("Elefante");
		
		palavrasUnicas.removerPalavra("Elefante");
		palavrasUnicas.exibirPalavrasUnicas();
		palavrasUnicas.verificarPalavra("Elefante");
		
	}
	
	private Set<String> palavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		palavrasUnicas = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavrasUnicas.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		for(String palavras : palavrasUnicas ) {
			if(palavras.equalsIgnoreCase(palavra)) {
				palavrasUnicas.remove(palavra);
				break;
			}
		}
	}
	
	public void verificarPalavra(String palavra) {
		if(!palavrasUnicas.isEmpty()) {
			for(String palavras : palavrasUnicas ) {
				if(palavras.equalsIgnoreCase(palavra)) {
					System.out.println("A palavra " + palavra + " existe");
					break;
				}else {
					System.out.println("A palavra " + palavra + " não foi encontrada!");
					break;
				}
			}
		}
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(palavrasUnicas.toString());
	}

	public String toString() {
		return "ConjuntoPalavrasUnicas [palavrasUnicas=" + palavrasUnicas + "]";
	}
}
