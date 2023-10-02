package servicos.apps;

import servicos.ServicoMensagemInstantanea;

public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem(String mensagem){	
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo MSN: " + mensagem);
		salvarHistoricoMensagem(mensagem);
	}
	
	public void receberMensagem(String mensagem){
		System.out.println("Mensagem recebida pelo MSN: " + mensagem);
		salvarHistoricoMensagem(mensagem);
	}
		
	private void salvarHistoricoMensagem(String mensagem){
		System.out.println("Sua mensagem foi salva!");
	}
}