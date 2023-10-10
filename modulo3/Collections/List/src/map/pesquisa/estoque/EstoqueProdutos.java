package map.pesquisa.estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutosMap;
	
	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adcionarProduto(long cod, String nome, double preco, int quantidade) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					maiorPreco = p.getPreco();
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco() < menorPreco) {
					menorPreco = p.getPreco();
					produtoMaisBarato = p;
				}
			}
		}
		return produtoMaisBarato;
	}
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() { //retorna um produto que possui maior preco, baseado na quantidade
		Produto produtoMaiorValor = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if((p.getPreco() * p.getQuantidade()) > maiorPreco) {
					maiorPreco = p.getPreco() * p.getQuantidade();
					produtoMaiorValor = p;
				}
			}
		}
		return produtoMaiorValor;
	}
	
	public static void main(String[] args) {
		EstoqueProdutos produtosEstoque = new EstoqueProdutos();
		
		produtosEstoque.adcionarProduto(1, "Arroz", 10d, 2);
		produtosEstoque.adcionarProduto(2, "Feijão", 6d, 3);
		produtosEstoque.adcionarProduto(3, "Massa", 3d, 5);
		
		produtosEstoque.exibirProdutos();
		System.out.println("Valor total de: R$" + produtosEstoque.calcularValorTotalEstoque());
		
		//System.out.println(produtosEstoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
		System.out.println(produtosEstoque.obterProdutoMaisBarato());
		System.out.println(produtosEstoque.obterProdutoMaisCaro());
	}
}
