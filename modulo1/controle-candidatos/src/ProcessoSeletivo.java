import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // Array com a lista de candidatos
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE" };
        

        String candidatosSelecionados;
        int numCandidatosSelecionados = 0;
        int proximoCandidato = 0;
        //selecionar 5 candidatos para entrevista baseado no salário
        double salarioPretendido = 0;
        
        
        while (numCandidatosSelecionados < 5 | proximoCandidato < candidatos.length){

            salarioPretendido = valorPretendido();

            //2 opções => tirar o analisarCandidato e fazer o teste aqui mesmo.
            //opção 2 tentar retornar o contador de candidatos selecionados.  
            candidatosSelecionados = analisarCandidato(salarioPretendido, candidatos[proximoCandidato]) + " ";
            
            
            String [] resultado = candidatosSelecionados.split(" ");
            
            if(resultado[1] != ""){
                int conversor = Integer.parseInt(resultado[1]);

            }
            

            proximoCandidato++;
        }
        //imprimir os candidatos selecionados
        
        //Realizar ligação p/ candidato com no máximo 3 tentativas

    }

    static String analisarCandidato(double salarioPretendido, String candidato) {
        double salarioBase = 2000;
        
        if (salarioBase >= salarioPretendido){
            System.out.println("Selecionar candidato(a): " + candidato);
            return candidato + " 1";
        }
        else{
            System.out.println("Aguardando resultado dos demais candidatos");
            return "";
        }
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}
