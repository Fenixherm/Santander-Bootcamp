package stream_api;

import java.util.Arrays;
import java.util.List;

public class AcimaDeDez {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 4, 3);

        List<Integer> numeroMaiorQueDez = numeros.stream().filter(n -> n > 10).toList();

        numeroMaiorQueDez.forEach(System.out::println);
    }
}
