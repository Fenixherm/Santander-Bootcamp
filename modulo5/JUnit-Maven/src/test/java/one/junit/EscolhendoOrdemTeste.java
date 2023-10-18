package one.junit;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //ordem baseado na annotion order
//@TestMethodOrder(MethodOrderer.MethodName.class) //Ordem alfabetica
//@TestMethodOrder(MethodOrderer.Random.class) //Randomico
@TestMethodOrder(MethodOrderer.DisplayName.class) //Display name ordem alfabetica
                                                // e depois quem nao possui display name
public class EscolhendoOrdemTeste {

    //@DisplayName("A")
    //@Order(4)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    //@Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }
    @DisplayName("D")
    //@Order(2)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    //@Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}
