import java.util.Scanner;

public class SmartTv {
    public static void main(String[] arg){
        boolean ligada = false;
        int canal = 5;
        int volume = 1;
        
        ligada = ligarOuDesligar(ligada);
        if(ligada == true)
            System.out.println("Sua TV está ligada!");
        else
            System.out.println("Sua TV está desligada!");

        canal = mudarCanalDesejado(canal);
        System.out.println("Você está assistindo ao canal: " + canal);

        volume = diminuirVolume(volume);
        System.out.println("Seu volume atual é: " + volume);

        volume = diminuirVolume(volume);
    }


    public static boolean ligarOuDesligar(boolean estado){
        return estado == true ? false : true;
    }

    public static int mudarCanalDesejado(int canal){
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

    public static int aumentarCanal(int canal){
        if (canal >= 100){
            System.out.println("Já está no volume máximo!");
            return 100;
        }else
            return ++canal;
    }

    public static int diminuirCanal(int canal){
        if (canal < 1){
            System.out.println("Já está no volume máximo!");
            return 0;
        }else
            return --canal;
    }

    public static int aumentarVolume(int volume){
        if (volume >= 10){
            System.out.println("Já está no volume máximo!");
            return 10;
        }else
            return ++volume;
    }   

    public static int diminuirVolume (int volume){
        if (volume <= 0){
            System.out.println("Sua TV já está no mudo");
            return 0;
        }else
            return --volume;
    } 
}
