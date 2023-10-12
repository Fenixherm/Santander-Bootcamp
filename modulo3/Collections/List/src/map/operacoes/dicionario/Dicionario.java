package map.operacoes.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionario;
	
	public Dicionario() {
		dicionario = new HashMap<>();
	}
	
	void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}
	
	void removerPalavra(String palavra) {
		dicionario.remove(palavra);
	}
	
	void exibirPalavras() {
		System.out.println(dicionario);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String pesquisaPorPalavra = null;
		if(!dicionario.isEmpty()) {
			pesquisaPorPalavra = dicionario.get(palavra);
		}
		return pesquisaPorPalavra;
	}
	
	public static void main(String[] args) {
		Dicionario dicionarioMap = new Dicionario();
		
		dicionarioMap.adicionarPalavra("Cachorro", "Animal de Estimação e amigo do homem");
		dicionarioMap.adicionarPalavra("Gato", "Animal de Estimação e troll");
		dicionarioMap.adicionarPalavra("Piramide", "Uma construção antiga em formato de retangulo criado pelos Egipcios");
		
		dicionarioMap.exibirPalavras();
		System.out.println(dicionarioMap.pesquisarPorPalavra("Cachorro"));
		dicionarioMap.removerPalavra("Gato");
		dicionarioMap.exibirPalavras();
	}
}
