package set.conjunto.palavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		palavrasUnicas = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavrasUnicas.add(palavra);
	}
	
	
}
