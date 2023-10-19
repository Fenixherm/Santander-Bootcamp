package dio.springboot;

import dio.springboot.app.Calculadora;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculadoraTest {
    @Autowired
    private Calculadora calculadora;

    @Test
    void somar() {
        assertEquals(10, calculadora.somar(5,5));
    }
}