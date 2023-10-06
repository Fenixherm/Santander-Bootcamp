package set.pesquisa.agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	public static void main(String[] args) {
		AgendaContatos contatos = new AgendaContatos();
		
		contatos.adicionarContato("Jrizk", 15159595);
		contatos.adicionarContato("Frontiendi", 1515150);
		contatos.adicionarContato("Doninha", 1599865);
		
		contatos.exibirContatos();
		System.out.println(contatos.pesquisarPorNome("Jrizk"));
		contatos.atualizarNumeroContato("Jrizka", 14149494);
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
		Set<Contato> contato = new HashSet<>();
		if(!agenda.isEmpty()) {
			for(Contato c: agenda) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					contato.add(c);
				}
			}
			return contato;
		}else
			return contato; //lançar throw exception
	}
	
	void atualizarNumeroContato(String nome, int novoNumero) {
		if(!agenda.isEmpty()) {
			for(Contato c: agenda) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					c.setNumeroTelefone(novoNumero);
				}else
					System.out.println("Nome não encontrado");
			}
		}else
			System.out.println("nome não encontrado");
	}
}
