package map.ordenacao.eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	Map<LocalDate, Evento> agendaEventosMap;
	
	public AgendaEventos(){
		agendaEventosMap = new HashMap<>();
	}
	
	void adicionarEvento(LocalDate data,String nome, String atracao) {
		
		agendaEventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap); //eventosTreeMap já fica na ordem por conta do LocalDate
		System.out.println(eventosTreeMap);
	}
	
	public Evento obterProximoEvento() {
		
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		//agendaEventos.adicionarEvento(, "Festival Experience", "Alok");
	}
}
