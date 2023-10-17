package one.junit;

import java.util.Objects;

public class PessoaService {
    public boolean isAdult(Pessoa pessoa){
        Objects.requireNonNull(pessoa, "Pessoa não pode ser Nulo");
        return pessoa.getAge() >= 18;
    }

    public boolean sameAge(Pessoa pessoa1, Pessoa pessoa2){
        return pessoa1.getAge() == pessoa2.getAge();
    }
}
