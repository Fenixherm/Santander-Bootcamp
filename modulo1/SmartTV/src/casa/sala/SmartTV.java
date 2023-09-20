package casa.sala;
import java.util.Scanner;

//unica coisa que mudou aqui, não é criado uma classe main, e sim uma classe SmartTV e a partir dela a gente define os atributos e os métodos existentes nela, conseguindo definir ela como um objeto dentro de outra classe, podendo ter acesso aos métodos da mesma.
public class SmartTV {
    boolean ligada = false;
    int canal = 5;
    int volume = 1;

    public void ligar() {
        ligada = true;
        System.out.println("Sua TV Ligou!");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Sua TV Desligou!");
    }

    public void mudarCanalDesejado() {
        if (ligada) {
            try (Scanner ler = new Scanner(System.in)) {
                int aux;
                System.out.println("Digite o número do canal: ");
                aux = ler.nextInt();

                if (aux < 1 || aux > 100) {
                    System.out.println("---Digite um canal entre 1 e 100---");
                    System.out.println("Você está assistindo ao canal: " + canal);
                }else
                    System.out.println("Você está assistindo ao canal: " + aux);
                    canal = aux;
            }
        }else
           System.out.println("Sua TV está desligada"); 
    }

    public void aumentarCanal() {
        if (ligada) {
            if (canal >= 100) {
                System.out.println("Já está no ultimo canal!");
            } else {
                canal++;
            }
        } else
            System.out.println("Sua TV está desligada");
    }

    public void diminuirCanal() {
        if (ligada) {
            if (canal < 1) {
                System.out.println("Já está no primeiro canal!");
            } else
                canal--;
        } else
            System.out.println("Sua TV está desligada");
    }

    public void aumentarVolume() {
        if (ligada) {
            if (volume >= 10) {
                System.out.println("Já está no volume máximo!");
            } else
                volume++;
        } else
            System.out.println("Sua TV está desligada");
    }

    public void diminuirVolume (){
        if (ligada){
            if (volume <= 0){
                System.out.println("Sua TV já está no mudo");
            }else
                volume--;            
        }else
            System.out.println("Sua TV está desligada");
    }
}