package set.pesquisa.agenda;

import java.util.HashSet;
import java.util.Set;

import javax.management.RuntimeErrorException;

public class AgendaContatos {
	public static void main(String[] args) {
		AgendaContatos contatos = new AgendaContatos();
		
		contatos.adicionarContato("Jrizk", 15159595);
		contatos.adicionarContato("Frontiendi", 1515150);
		contatos.adicionarContato("Doninha", 1599865);
		contatos.adicionarContato("Doninha", 1599864);
		
		contatos.exibirContatos();
		System.out.println(contatos.pesquisarPorNome("Jrizk"));
		contatos.atualizarNumeroContato("Jrizk", 141494954);
		System.out.println(contatos.pesquisarPorNome("Jrizk"));
		
	}
	
	private Set<Contato> agenda;
	
	AgendaContatos(){
		agenda = new HashSet<>();
	}
	
	void adicionarContato(String nome, int numero) {
		agenda.add(new Contato(nome, numero));
	}
	
	void exibirContatos() {
		if(!agenda.isEmpty()) {
			System.out.println(agenda.toString());
		}
	}
	
	Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatoPorNome = new HashSet<>();
		if(!agenda.isEmpty()) {
			for(Contato c: agenda) {
				if(c.getNome().startsWith(nome)) {
					contatoPorNome.add(c);
				}
			}
			return contatoPorNome;
		}else
			return contatoPorNome; //lançar throw exception
	}
	
	//forma 1
	void atualizarNumeroContato(String nome, int novoNumero) {
		if(!agenda.isEmpty()) {
			for(Contato c: agenda) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					c.setNumeroTelefone(novoNumero);
				}
			}
		}else
			System.out.println("nome não encontrado"); //lançar throw exception
	}
	
	//forma 2
	/*
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if(!agenda.isEmpty()) {
			for(Contato c: agenda) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					c.setNumeroTelefone(novoNumero);
					contatoAtualizado = c;
					return contatoAtualizado;
				}
			}
		}
		return contatoAtualizado;
	}*/
}
