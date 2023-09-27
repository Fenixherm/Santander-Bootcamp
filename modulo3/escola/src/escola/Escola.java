package escola;

import escola.aluno.Aluno;
import escola.funcionarios.professores.Professor;

public class Escola {
	public static void main(String[] args) {
		
		Professor Marcio = new Professor("02598873055", "Marcio"); 
		
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		felipe.setSexo("Masculino");
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos " + " e é do sexo " + felipe.getSexo());
		System.out.println("O professor " + Marcio.getNome() + " chegou a sala de aula.");
	}
}