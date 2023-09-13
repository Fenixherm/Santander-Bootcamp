public class Operadores {
    public static void main(String[] args){
        //Exemplo de concatenação 
        /* 
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        */
        //Operadores Unários
        //int numero = 5;

        /*
        numero = - numero; 

        System.out.println(numero);

        numero = - numero;

        System.out.println(numero);
        */

        //Operadores de incremento
        /*
        int numero = 5;
        numero++;
        System.out.println(numero); // 6

        System.out.println(numero++); // 6 =>  aqui o incremento só acontece após a impressão do número
        System.out.println(numero); // 7

        System.out.println(++ numero); //8 => Aqui o incremento acontece antes de imprimir
        */

        //Operadores relacionais
        /*
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 != numero2; // ao realizar uma comparacao e atribuir a um boolean, ele atribui se é true ou false apenas

        System.out.println("Numero "+ numero1 + " é diferente a Numero " + numero2 + " ? " + simNao);
        */
        
        String nomeUm = "Jow";
        String nomeDois = new String("Jow");

        System.out.println(nomeUm.equals(nomeDois)); // true
    }
}