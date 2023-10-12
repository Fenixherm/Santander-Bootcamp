package functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        List<String> nomes = Stream.generate(new Supplier<String>() {
            public String get() {
                return "Olá, seja bem-vindo(a)!";
            }
        }).limit(3).toList();

        //List<String> nomes = Stream.generate(() -> "Olá, seja bem-vindo(a)!").limit(3).toList();

        // Imprimir as saudações geradas
        nomes.forEach(System.out::println);
    }
}
