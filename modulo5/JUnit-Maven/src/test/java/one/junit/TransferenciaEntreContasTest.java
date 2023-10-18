package one.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferenciaEntreContasTest {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("234567", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        //Espera uma exceçao
        assertThrows(IllegalArgumentException.class,
                () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

        //Nao espera uma exceçao
        assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }


}