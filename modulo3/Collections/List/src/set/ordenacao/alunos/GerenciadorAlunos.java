package set.ordenacao.alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class GerenciadorAlunos {
	public static void main(String[] args) {
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
		
		gerenciadorAlunos.adicionarAluno("Guilherme", 159L, 7d);
		gerenciadorAlunos.adicionarAluno("Lucas", 156L, 8d);
		gerenciadorAlunos.adicionarAluno("Leonardo", 156L, 9d); 
		gerenciadorAlunos.removerAluno(159L);
		gerenciadorAlunos.adicionarAluno("Jessica", 12L, 9d);
		gerenciadorAlunos.adicionarAluno("Alberto", 15L, 6.5d);
		
		gerenciadorAlunos.exibirAlunos();
		gerenciadorAlunos.exibirAlunosPorNome();
		System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
	}
	
	private Set<Aluno> listaAlunos;
	
	
	
	GerenciadorAlunos(){
		listaAlunos = new HashSet<>();
	}
	
	void adicionarAluno(String nome, Long matricula, double media){
		listaAlunos.add(new Aluno(nome, matricula, media));
	}
	
	void removerAluno(long matricula){
		if(!listaAlunos.isEmpty()) {
			for(Aluno a : listaAlunos) {
				if(a.getMatricula() == matricula) {
					listaAlunos.remove(a);
					
				}
			}
		}
	}
	
	void exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
		System.out.println(alunosPorNome.toString());
	}
	
	Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(listaAlunos);
		return alunosPorNota;
	}
	
	void exibirAlunos() {
		System.out.println(listaAlunos.toString());
	}
	
}
