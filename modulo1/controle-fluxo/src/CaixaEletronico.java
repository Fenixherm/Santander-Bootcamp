import java.util.InputMismatchException;
import java.util.Scanner;

// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) { 
        Usuario novoUsuario = new Usuario();
        int fluxoDesejado;

        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Olá " + novoUsuario.nome + " sejá bem vindo ao Banco Santander !");
            System.out.println(
                    "Sua agência é: " + novoUsuario.agencia + " e o número da sua conta é: " + novoUsuario.numeroConta);

            do {
                System.out.println("Se você deseja sacar, pressione '1' ou se você deseja depositar, pressione '2'");
                fluxoDesejado = ler.nextInt();
            } while (fluxoDesejado < 1 || fluxoDesejado > 2);
        

            switch(fluxoDesejado) {
                case 1: {
                    novoUsuario.saldo = sacar(novoUsuario.saldo);
                    break;
                }
                case 2: {
                    novoUsuario.saldo = depositar(novoUsuario.saldo);
                    break;
                }
            }
            System.out.println("O seu saldo atual é de: R$" + novoUsuario.saldo);

        }catch(InputMismatchException e){
            System.out.println("Por favor digite somente números !");
        }
    }

    public static double sacar(double saldo) {
        double valorDesejado;
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Você tem disponível: R$" + saldo + " de saldo para saque !");

            System.out.println("Digite o valor que deseja sacar: ");
            valorDesejado = ler.nextDouble();
        
            if (valorDesejado > saldo) {
                System.out.println("Não foi possível realizar o Saque");
                return saldo;
            } else
                System.out.println("Você sacou: R$" + valorDesejado);
                return saldo - valorDesejado;

        }catch(InputMismatchException e){
            System.out.println("Por favor digite somente números !");
            return saldo;
        }
    }

    public static double depositar(double saldo) {
        double valorDesejado;
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Você tem disponível: R$" + saldo + " de saldo em sua conta !");

            System.out.print("Digite o valor que você deseja depositar: R$");
            valorDesejado = ler.nextDouble();

            return saldo + valorDesejado;

        }catch(InputMismatchException e){
            System.out.println("Por favor digite somente números !");
            return saldo;
        }
    }

}