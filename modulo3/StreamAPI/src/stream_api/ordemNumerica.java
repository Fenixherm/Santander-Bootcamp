package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ordemNumerica {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Ordem Natural");
        List<Integer> numerosOrdemCrescente = numeros.stream().sorted().toList();
        numerosOrdemCrescente.forEach(n -> System.out.print(n + " "));

        System.out.println("\n"+ "Ordem Reversa");
        List<Integer> numeroOrdemDecrescente = numeros.stream().sorted(Comparator.reverseOrder()).toList();
        numeroOrdemDecrescente.forEach(n -> System.out.print(n + " "));

    }
}
