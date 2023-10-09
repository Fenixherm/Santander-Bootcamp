package set.ordenacao.alunos;

import java.util.Comparator;

public class ComparatorPorNota implements Comparator<Aluno>{
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a1.getMedia(), a2.getMedia());
	}
	
}
