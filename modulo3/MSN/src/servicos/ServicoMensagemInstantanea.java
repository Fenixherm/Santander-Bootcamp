package servicos;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem(String mensagem);
	
	public abstract void receberMensagem(String mensagem);
	
	//Somente os filhos conhecem este método
	protected void validarConexaoInternet(){
		System.out.println("Verificando conexão");
	}
}