package ordenacaoList.ordernaPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	
	public static void main(String[] args) {
		OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
		
		pessoas.adicionarPessoa("Lucas", 10, 1.5);
		pessoas.adicionarPessoa("Lotis", 12, 1.45);
		pessoas.adicionarPessoa("Denis", 15, 1.7);
		pessoas.adicionarPessoa("Joana", 13, 1.35);
		
		System.out.println(pessoas.ordenarPorAltura());
		System.out.println(pessoas.ordenarPorIdade());
	}
	
	
	private List<Pessoa> listaDePessoas;
	
	public OrdenacaoPessoas (){
		listaDePessoas = new ArrayList<>();
	}
	
	void adicionarPessoa(String nome, int idade, double altura) {
		listaDePessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas); // inicializando com a lista completa de pessoas.
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
}
