package casa.sala;
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV(); //instanciando um objeto SmartTV

        smartTV.ligar();
        //System.out.println("TV está ligada ? " + smartTV.ligada);

        smartTV.mudarCanalDesejado();
        

        smartTV.diminuirVolume();
        System.out.println("Seu volume atual é: " + smartTV.volume);

        smartTV.diminuirVolume();
    
        smartTV.desligar();

    }
}
