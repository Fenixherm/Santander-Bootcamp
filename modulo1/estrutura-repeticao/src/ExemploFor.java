public class ExemploFor {
    public static void main(String[] args) throws Exception {
        String[] lanches = {"Cachorro quente", "X-burguer", "X-tudo"};
        System.out.println("Cardápio");

        /* Exemplo normal
        for(int indice = 0; indice < lanches.length; indice++){
            System.out.println(lanches[indice]);
        }
        */

        // É como se cada índice do array é passado a informação para a variável //cardápio
        for(String cardapio : lanches){
            System.out.println("Lanche: " + cardapio); 
        }

    }
}