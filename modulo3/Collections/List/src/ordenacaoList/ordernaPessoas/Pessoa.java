package ordenacaoList.ordernaPessoas;

public class Pessoa implements Comparable<Pessoa> {
	private String name;
	private int idade;
	private double altura;
	
	public Pessoa(String name, int idade, double altura) {
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}

	public String getName() {
		return name;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", idade=" + idade + ", altura=" + altura + "]";
	}

	@Override
	public int compareTo(Pessoa p) {
		return Integer.compare(idade, p.getIdade());
	}
}
