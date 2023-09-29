package servicos;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem(String mensagem);
	
	public abstract void receberMensagem(String mensagem);
}