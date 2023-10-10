package map.operacoes.agenda;

import java.awt.Container;
import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;
	
	public AgendaContatos(){
		this.agendaContatoMap = new HashMap();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone); //serve para adicionar e também atualizar
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome); // como a key é valor único não preciso usar for.
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.adicionarContato("Guilherme", 998616161); // original
		agenda.adicionarContato("Guilherme", 5665); //ao repetir a key é feito um replace
		agenda.adicionarContato("Guilherme Augusto", 5151515);
		agenda.adicionarContato("Jonas", 566511);
		agenda.adicionarContato("Camila", 566511);
		agenda.exibirContatos();
		agenda.removerContato("Guilherme Augusto");
		System.out.println("O número é:" + agenda.pesquisarPorNome("Jonas"));
	}
}