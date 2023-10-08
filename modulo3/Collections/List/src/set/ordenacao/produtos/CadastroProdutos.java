package set.ordenacao.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;
	
	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtorPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoSet.addAll(produtorPorPreco);
		return produtorPorPreco;
	}
	
}
