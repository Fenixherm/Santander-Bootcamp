public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV(); //instanciando um objeto SmartTV

        smartTV.ligar();
        System.out.println("TV está ligada ? " + smartTV.ligada);

        smartTV.canal = smartTV.mudarCanalDesejado(smartTV.canal);
        System.out.println("Você está assistindo ao canal: " + smartTV.canal);

        smartTV.volume = smartTV.diminuirVolume(smartTV.volume);
        System.out.println("Seu volume atual é: " + smartTV.volume);

        smartTV.volume = smartTV.diminuirVolume(smartTV.volume);
    
        

    }
}
