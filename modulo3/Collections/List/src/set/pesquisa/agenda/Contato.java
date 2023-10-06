package set.pesquisa.agenda;

public class Contato {
	private String nome;
	private int numeroTelefone;
	
	
	public Contato(String nome, int numeroTelefone) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
	}
	
	public String getNome() {
		return nome;
	}
	public int getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String toString() {
		return "Contato [nome=" + nome + ", numeroTelefone=" + numeroTelefone + "]";
	}
}
