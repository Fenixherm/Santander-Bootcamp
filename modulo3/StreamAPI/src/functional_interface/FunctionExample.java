package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> numerosQuebrados = numeros.stream().map(numero -> (double) numero / 2).toList();



        // Imprimir a lista de números dobrados
        numerosQuebrados.forEach(System.out::println);
    }
}
