public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ?
        /*
         * 1, 2, 4, 5 pois quando a condição do if é acionada, ele interrompe o laço de repetição só naquele ponto, e continua a partir do próximo laço.
         * ou seja a partir do 4.
         */
        
    }
    
}
