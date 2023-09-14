import java.util.Scanner;
//unica coisa que mudou aqui, não é criado uma classe main, e sim uma classe SmartTV e a partir dela a gente define os atributos e os métodos existentes nela.
public class SmartTV {
    boolean ligada = false;
    int canal = 5;
    int volume = 1;

    public void ligar()
    {
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public int mudarCanalDesejado(int canal){
        Scanner ler = new Scanner(System.in);
        int canal1;
        System.out.println("Digite o número do canal: ");
        canal1 = ler.nextInt();

        if(canal1 < 1 || canal1 > 100){
            System.out.println("---Digite um canal entre 1 e 100---");
            return canal;
        }
        else
            return canal1;
    }

    public int aumentarCanal(int canal){
        if (canal >= 100){
            System.out.println("Já está no volume máximo!");
            return 100;
        }else
            return ++canal;
    }

    public int diminuirCanal(int canal){
        if (canal < 1){
            System.out.println("Já está no volume máximo!");
            return 0;
        }else
            return --canal;
    }
    
    public int aumentarVolume(int volume){
        if (volume >= 10){
            System.out.println("Já está no volume máximo!");
            return 10;
        }else
            return ++volume;
    }   

    public int diminuirVolume (int volume){
        if (volume <= 0){
            System.out.println("Sua TV já está no mudo");
            return 0;
        }else
            return --volume;
    } 
}
