package set.pesquisa.tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		listaTarefas.adicionarTarefa("Estudar inglês");
		listaTarefas.exibirTarefas();
		listaTarefas.removerTarefa("Estudar inglês");
		listaTarefas.exibirTarefas();
		listaTarefas.adicionarTarefa("Estudar Chinês");
		listaTarefas.adicionarTarefa("Estudar Japonês");
		listaTarefas.contarTarefas();
		listaTarefas.marcarTarefaConcluida("Estudar Chinês");
		listaTarefas.marcarTarefaConcluida("Estudar Japonês");
		
		System.out.println("A:" + listaTarefas.obterTarefasConcluidas() + " está concluído !");
		listaTarefas.marcarTarefaPendente("Estudar Chinês");
		System.out.println("A:" + listaTarefas.obterTarefasPendentes() + " está pendente");
		
		listaTarefas.limparListaTarefas();
		listaTarefas.exibirTarefas();
		
	}
	
	private Set<Tarefa> tarefas;
	
	public ListaTarefas(){
		tarefas = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao){
		tarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		if(!tarefas.isEmpty()) {
			for(Tarefa t: tarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefas.remove(t);
					break;
				}
			}
		}else
			System.out.println("A lista de tarefas está vazia");
	}
	
	public void exibirTarefas() {
		if(!tarefas.isEmpty())
			System.out.println(tarefas.toString());
		else
			System.out.println("Sua lista de tarefas está vazia !");
	}
	
	public void contarTarefas() {
		System.out.println("Você possuí: " + tarefas.size() + " tarefas registradas !");
	}
	
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		if(!tarefas.isEmpty()) {
			for(Tarefa t : tarefas) {
				if(t.isTarefaConcluida()) {
					tarefasConcluidas.add(t);
				}
			}
			return tarefasConcluidas;
		}else
			return tarefasConcluidas; //tratar com throw exception
	}
	
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		if(!tarefas.isEmpty()) {
			for(Tarefa t : tarefas) {
				if(!t.isTarefaConcluida()) {
					tarefasPendentes.add(t);
				}
			}
			return tarefasPendentes;
		}else
			return tarefasPendentes; //tratar com throw exception
	}
	
	public void marcarTarefaConcluida(String descricao) {
		if(!tarefas.isEmpty()) {
			for(Tarefa t: tarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setTarefaConcluida(true);
				}
			}
		}else
			System.out.println("A lista de tarefas está vazia");
	}
	
	public void marcarTarefaPendente(String descricao) {
		if(!tarefas.isEmpty()) {
			for(Tarefa t: tarefas) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setTarefaConcluida(false);
				}
			}
		}else
			System.out.println("A lista de tarefas está vazia");
	}
	
	public void limparListaTarefas() {
		if(!tarefas.isEmpty()) {
			tarefas.removeAll(tarefas);
		}else
			System.out.println("A lista de tarefas está vazia");
	}
}
