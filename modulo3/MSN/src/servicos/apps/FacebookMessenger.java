package servicos.apps;

import servicos.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	public void enviarMensagem(String mensagem){
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo Facebook: " + mensagem);
	}

	public void receberMensagem(String mensagem){
		System.out.println("Mensagem recebida pelo Facebook: " + mensagem);
	}
}