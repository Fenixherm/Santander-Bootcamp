package dio.springboot.app;

import dio.springboot.app.login.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype")
    public User user(){
        System.out.println("-------Criando um usuario-------");
        return new User();
    }
}