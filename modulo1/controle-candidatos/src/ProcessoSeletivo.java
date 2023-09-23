import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // Array com a lista de candidatos
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE", "FELIPE2", "MÁRCIA2", "JULIA2", "PAULO2", "AUGUSTO2", "MÔNICA2", "FABRÍCIO2", "MIRELA2", "DANIELA2", "JORGE2"};
        String candidatosSelecionados = "";
        double salarioBase = 2000;
        double salarioPretendido = 0;
        int numCandidatosSelecionados = 0;
        int proximoCandidato = 0;
        
        
        
        while (numCandidatosSelecionados < 5 & proximoCandidato < candidatos.length){
            salarioPretendido = valorPretendido();

            if (salarioBase >= salarioPretendido){
                System.out.println("Selecionar candidato(a): " + candidatos[proximoCandidato]);
                candidatosSelecionados = candidatosSelecionados + candidatos[proximoCandidato] + " ";
                numCandidatosSelecionados++;
            }
            
            else{
                System.out.println("Aguardando resultado dos demais candidatos");
            }

            proximoCandidato++;
        }
        imprimirSelecionados(candidatosSelecionados);
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimirSelecionados(String candidatos) {
        String [] candidatosSelecionados  = candidatos.split(" ");
        for(int i = 0; i < candidatosSelecionados.length; i++){
            System.out.println("O candidato: " + candidatosSelecionados[i] + " foi selecionado !");
        }
        
        for (String candidato : candidatosSelecionados) {
            fazerLigacao(candidato);
        }

    }

    static void fazerLigacao(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");
        }while(continuarTentando & tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        }else
        System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }

    static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
}
