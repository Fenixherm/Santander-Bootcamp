package functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    /*
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        List<Integer> numerosPares = numeros.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer numero) {
                return numero % 2 == 0;
            }
        }).toList();

        // Imprimir a lista de números pares
        numerosPares.forEach(System.out::println);
    }*/

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Cachorro", "Gato", "Elefante", "Tigre", "Leao", "Cobra", "Girafa");

        palavras.stream().filter(palavra -> palavra.length() > 5).toList().forEach(System.out::println);

    }
}