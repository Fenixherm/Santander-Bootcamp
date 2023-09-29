package servicos.apps;

import servicos.ServicoMensagemInstantanea;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	public void enviarMensagem(String mensagem){
		verificarLoginUsuario();
		System.out.println("Enviando mensagem pelo Facebook: " + mensagem);
	}

	public void receberMensagem(String mensagem){
		System.out.println("Mensagem recebida pelo Facebook: " + mensagem);
	}
	
	private void verificarLoginUsuario() {
		System.out.println("Usuario está logado no Facebook!");
	}
}