import servicos.apps.MSNMessenger;
import servicos.apps.Telegram;
import servicos.apps.FacebookMessenger;

public class Computador {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();		
		FacebookMessenger fcb = new FacebookMessenger();
		Telegram tg = new Telegram();
		
		msn.enviarMensagem("Hello World!");
		msn.receberMensagem("Hi!");
		
		fcb.enviarMensagem("Hello World!");
		fcb.receberMensagem("Hi!");
		
		tg.enviarMensagem("Hello World!");
		tg.receberMensagem("Hi!");
	}
}