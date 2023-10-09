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
		produtorPorPreco.addAll(produtoSet);
		return produtorPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
		cadastroProdutos.adicionarProduto(2L, "Produto 8", 20d, 10);
		cadastroProdutos.adicionarProduto(1L, "Produto 7", 10d, 2);
		cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);
		
		System.out.println(cadastroProdutos.produtoSet);
		
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
	
}
