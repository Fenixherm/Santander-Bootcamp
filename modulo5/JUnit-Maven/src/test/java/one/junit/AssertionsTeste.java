package one.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTeste {

    @Test
    void validaArray(){
        int [] vetorInt = {10, 15, 20, 25, 30};
        int [] vetor2 = {10, 15, 20, 25, 30};

        assertArrayEquals(vetorInt, vetor2);
    }

    @Test
    void validaNulo(){
        Pessoa pessoa = null;

        assertNull(pessoa);
    }

    @Test
    void validaNotNulo(){
        Pessoa pessoa = new Pessoa(15);

        assertNotNull(pessoa);
    }

}
