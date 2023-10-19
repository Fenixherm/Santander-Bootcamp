package dio.springboot.app.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class UserSystem {
    @Autowired
    private User newUser;
    @Autowired
    private User john;
    public void sendSignUpConfirmation(){
        System.out.println(newUser);
        System.out.println("Welcome, sign up completed !");
    }

    public void sendWelcomeMessage(){
        john.setUsername("John-Wecky");
        john.setEmail("john@user.com");
        System.out.println(john);
        System.out.println("Welcome John\n");
    }
}
