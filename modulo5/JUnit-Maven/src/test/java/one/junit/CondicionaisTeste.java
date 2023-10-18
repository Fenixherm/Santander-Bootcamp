package one.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    @EnabledOnOs(OS.LINUX)
    @EnabledIfEnvironmentVariable(named = "USER", matches = "saito")
    @EnabledOnJre(JRE.JAVA_18)
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_18)
    void validarUsuario(){

        Assertions.assertEquals(10, 5+5);
    }
}
