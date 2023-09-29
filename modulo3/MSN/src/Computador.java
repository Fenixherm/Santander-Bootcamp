public class Computador {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		
		msn.enviarMensagem("Hello World!");
		msn.receberMensagem("Hi!");
	}
}