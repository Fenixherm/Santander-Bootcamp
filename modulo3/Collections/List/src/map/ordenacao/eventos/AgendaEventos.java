package map.ordenacao.eventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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
	/**
	 * 
	 * 
	 *  
	 */
	public void obterProximoEvento() {
		/*
		Set<LocalDate> dataSet = agendaEventosMap.keySet(); //keySet() retorna um set de todas as keys.
		Collection<Evento> values = agendaEventosMap.values(); //values() retorna uma collection de todos os values.
		*/
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				
				System.out.println("O próximo evento: " + proximaData + " acontecerá em: " + proximoEvento);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		
		agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 21), "Festival Experience", "Alok");
		agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 22), "Festival PsyVidaL0k4", "Neelix");
		agendaEventos.adicionarEvento(LocalDate.of(2022, 5, 05), "Anime Friends", "Show do Flow");
		agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 10), "Anime meme", "Show dos trolls");
		agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 11), "Dia das Não bruxas", "Travessuras");
		
		agendaEventos.exibirAgenda();
		agendaEventos.obterProximoEvento();
		
	}
}
