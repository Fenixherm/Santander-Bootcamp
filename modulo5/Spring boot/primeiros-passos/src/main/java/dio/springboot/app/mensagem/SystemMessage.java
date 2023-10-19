
package dio.springboot.app.mensagem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class SystemMessage  implements CommandLineRunner {
    @Value("${name: Teste}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones =
            new ArrayList<>(Arrays.asList(new Long[]{11956781254L}));


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem Enviada por: " + nome + "\nE-mail: " + email + "\nTelefone para Contato: " +telefones);
        System.out.println("Seu cadastro foi aprovado");
    }
}
