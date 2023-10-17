package one.junit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class Pessoa {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pessoa(int age) {
        this.age = age;
    }
}
