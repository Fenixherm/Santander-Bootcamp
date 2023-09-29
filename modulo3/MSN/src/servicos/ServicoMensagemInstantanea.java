package servicos;

public class ServicoMensagemInstantanea {
	public void enviarMensagem(String mensagem){	
		validarConexaoInternet();
		System.out.println("Enviando mensagem: " + mensagem);
		salvarHistoricoMensagem(mensagem);
	}
	
	public void receberMensagem(String mensagem){
		System.out.println("Mensagem: " + mensagem);
		salvarHistoricoMensagem(mensagem);
	}
	

	private void validarConexaoInternet(){
		System.out.println("Verificando conexão");
		//return true;
	}
	
	private void salvarHistoricoMensagem(String mensagem){
		System.out.println("Sua mensagem foi salva!");
		//return mensagem;
	}
}
