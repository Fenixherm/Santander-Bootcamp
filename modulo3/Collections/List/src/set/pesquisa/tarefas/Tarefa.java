package set.pesquisa.tarefas;

public class Tarefa {
	private String descricao;
	private boolean tarefaConcluida;
	
	Tarefa(String descricao){
		this.descricao = descricao;
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isTarefaConcluida() {
		return tarefaConcluida;
	}
	public void setTarefaConcluida(boolean tarefaConcluida) {
		this.tarefaConcluida = tarefaConcluida;
	}

	public String toString() {
		return "Tarefa [" + descricao + ", tarefaConcluida=" + tarefaConcluida + "]";
	}
}
