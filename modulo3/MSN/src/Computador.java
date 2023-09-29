import servicos.apps.MSNMessenger;
import servicos.apps.Telegram;
import servicos.ServicoMensagemInstantanea;
import servicos.apps.FacebookMessenger;

public class Computador {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "msn";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fcb"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("Tg"))
			smi = new Telegram();
		
		
		smi.enviarMensagem("Bom dia!");
		smi.receberMensagem("boa noite");
	}
}