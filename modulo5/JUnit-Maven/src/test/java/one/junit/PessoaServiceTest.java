package one.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaServiceTest {

    @Test
    @DisplayName("A pessoa não é Maior de Idade")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Pessoa jonas = new Pessoa(15);
        Pessoa neto = new Pessoa(17);
        Pessoa joao = new Pessoa(13);
        PessoaService pessoaService = new PessoaService();
        //Assertions.assertEquals(false, pessoaService.isAdult(pessoa)); (o que espera, método chamado)
        Assertions.assertEquals(false, pessoaService.isAdult(jonas)); //forma padrao

        Assertions.assertFalse(pessoaService.isAdult(neto)); //forma ok

        assertFalse(pessoaService.isAdult(joao)); //forma full resumida

    }


    @Test
    @DisplayName("A pessoa é maior de idade")
    void isAdult_ReturnTrueWhenAgeIsEqualOrHigherThan18(){
        Pessoa joao = new Pessoa(18);
        PessoaService pessoaService = new PessoaService();
        Assertions.assertEquals(true, pessoaService.isAdult(joao));

        Pessoa joana = new Pessoa(19);
        assertTrue(pessoaService.isAdult(joana)); //forma simplificada
    }

    @Test
    @DisplayName("Possui mesma idade")
    void sameAge_returnTrue(){
        Pessoa joao = new Pessoa(12);
        Pessoa jessica = new Pessoa(12);
        Pessoa lucas = new Pessoa(13);
        PessoaService pessoaService = new PessoaService();

        Assertions.assertEquals(true, pessoaService.sameAge(joao, jessica));
        Assertions.assertEquals(true, pessoaService.sameAge(lucas, jessica));
    }
}