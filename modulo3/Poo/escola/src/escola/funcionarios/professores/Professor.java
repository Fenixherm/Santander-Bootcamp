package escola.funcionarios.professores;

public class Professor {
	private String nome;
	private String cpf;
	private String endereco;
	
	// método construtor
		// o nome deverá ser igual ao nome da classe
		// ao usar construtor, basicamente quando é instanciado a classe
		// obrigatóriamente é passado os parâmetros de cpf e nome.
		// e também possui atalho source -> generate constructor.
	
	public Professor(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	

	public String getNome() {
		return nome;
	}
		
		//o método construtor é muito parecido com o set,a diferença que na hora de 'instânciar'
		// é obrigatório passar os parâmetros.
		// usar apenas atributos relevantes e importantes no construtor.
		
}
