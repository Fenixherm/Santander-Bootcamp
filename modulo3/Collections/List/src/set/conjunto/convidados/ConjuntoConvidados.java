package set.conjunto.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados(){
	
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados listaConvidadosSet = new ConjuntoConvidados();
		
		listaConvidadosSet.adicionarConvidado("Joaozinho", 001);
		listaConvidadosSet.adicionarConvidado("Joaozinho", 002);
		listaConvidadosSet.adicionarConvidado("Lusca", 003);
		System.out.println(listaConvidadosSet.contarConvidados());
		
		listaConvidadosSet.adicionarConvidado("Mané", 004);
		listaConvidadosSet.adicionarConvidado("masterReset", 005);
		listaConvidadosSet.adicionarConvidado("Joninhas", 005);
		listaConvidadosSet.adicionarConvidado("RAtimBum!", 006);
		
		System.out.println(listaConvidadosSet.contarConvidados());
		
		listaConvidadosSet.removerConvidadoPorCodigoConvite(002);
		
		listaConvidadosSet.exibirConvidados();
		
		System.out.println(listaConvidadosSet.contarConvidados());
	}
	
}

