import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // Array com a lista de candidatos
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE" };
        
        int candidatosSelecionados = 0;
        //selecionar 5 candidatos para entrevista baseado no salário

        //imprimir os candidatos selecionados

        //Realizar ligação p/ candidato com no máximo 3 tentativas

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000;
        if (salarioBase > salarioPretendido)
            System.out.println("Ligar para o candidato");
        else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o Candidato, com contra proprosta");
        else
            System.out.println("Aguardando resultado dos demais candidatos");

    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}
