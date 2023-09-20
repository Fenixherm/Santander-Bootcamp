public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("18284000"); // da erro pois pede para tratá-lo usando try/catch
            System.out.println("Seu CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Por favor digite seu CEP da maneira correta!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException(); //Mostra a exceção caso o tamanho seja não correspondente
        
        //Formatando um CEP.
        String [] cepFormatado = cep.split("");

        cep = "";
        
        for(int i = 0; i < 8; i++){
            if(i == 2){
                cep = cep + ".";
            }else if(i == 5){
                cep = cep + "-";
            }
            cep = cep + cepFormatado[i];
        }
        return cep;
    }
}
