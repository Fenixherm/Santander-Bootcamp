package servicos.apps;

import servicos.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea{

	public void enviarMensagem(String mensagem){	
		validarConexaoInternet();
		criptografarMensagem(mensagem);
		System.out.println("Enviando mensagem pelo Telegram: " + mensagem);
	}

	public void receberMensagem(String mensagem){
		descriptografarMensagem(mensagem);
		System.out.println("Mensagem recebida pelo Telegram: " + mensagem);
	}
	
	private void criptografarMensagem(String mensagem) {
		System.out.println("Telegram Criptografou a mensagem!");
	}
	
	private void descriptografarMensagem(String mensagem) {
		System.out.println("Telegram descriptografou a mensagem recebida!");
	}
}
