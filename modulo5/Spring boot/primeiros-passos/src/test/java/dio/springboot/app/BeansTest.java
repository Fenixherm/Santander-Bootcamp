package dio.springboot.app;

import dio.springboot.app.login.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeansTest {

    @Autowired
    private User user;

    @Test
    void user() {
        assertEquals(user.getUsername(), "NewUser");
        assertEquals(user.getEmail(), "newuser@newuser.com");
    }
}