package set.ordenacao.produtos;


import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private long codigo;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(long codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public long getCod() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	
	
}
