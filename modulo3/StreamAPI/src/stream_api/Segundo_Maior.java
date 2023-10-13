package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Segundo_Maior {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int segundoMaior = numeros.stream().sorted(Comparator.reverseOrder()).limit(2).min(Comparator.naturalOrder()).get();

        System.out.println(segundoMaior);
    }
}
