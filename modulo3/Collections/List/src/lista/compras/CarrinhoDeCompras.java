package lista.compras;

import java.util.ArrayList;

import java.util.List;

public class CarrinhoDeCompras {
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Maionese", 10, 1);
		carrinho.adicionarItem("Maionese", 10, 1);
		carrinho.adicionarItem("Ketchup", 5, 1);
		carrinho.exibirItens();
		
		carrinho.removerItem("Maionese");
		carrinho.removerItem("Ketchup");
		
		carrinho.exibirItens();
		
		System.out.println(carrinho.calcularValorTotal());
	}
	
	private List<Item> listItens;
	
	public CarrinhoDeCompras() {
		this.listItens = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		for(Item i: listItens) {
			if(nome == i.getNome()) {
				i.setQuantidade(++quantidade);
				return;
			}
		}
		listItens.add(new Item(nome, preco,quantidade));
	}
	
	public void removerItem(String nome){
		List<Item> itensParaRemover = new ArrayList<>();
		
		for(Item i : listItens) {
			if(i.getNome().equalsIgnoreCase(nome) && i.getQuantidade() > 1) {
				i.setQuantidade(i.getQuantidade() - 1);
			}else if(i.getNome().equalsIgnoreCase(nome)) { 
				itensParaRemover.add(i); 
			}
		}		
			listItens.removeAll(itensParaRemover);
	}
	
	public double calcularValorTotal() {
		double total = 0;
		for(Item i: listItens) {
			total = total + (i.getPreco() * i.getQuantidade());
		}
		return total;
	}
	
	public void exibirItens() {
		System.out.println(listItens);
	}
}
