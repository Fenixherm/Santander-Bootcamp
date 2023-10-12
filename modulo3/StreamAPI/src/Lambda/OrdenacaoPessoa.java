package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    void adicionarPessoa(String nome, int idade){
        this.pessoaList.add(new Pessoa(nome, idade));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> ordenarPorIdade = new ArrayList<>(this.pessoaList);
        if(!pessoaList.isEmpty()){

            System.out.println("Estou na TV mae");
            ordenarPorIdade.sort((Pessoa p1, Pessoa p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));

        }
        return ordenarPorIdade;
    }

    void imprimirListaPessoas(){
        System.out.println(pessoaList.toString());
    }

    public static void main(String[] args) {
        OrdenacaoPessoa listaPessoas = new OrdenacaoPessoa();

        listaPessoas.adicionarPessoa("Alex", 33);
        listaPessoas.adicionarPessoa("Guilherme", 25);
        listaPessoas.adicionarPessoa("Lucas", 26);
        listaPessoas.adicionarPessoa("Leonardo", 23);
        listaPessoas.adicionarPessoa("Matheus", 29);


        listaPessoas.imprimirListaPessoas();
        listaPessoas.ordenarPorIdade();
        listaPessoas.imprimirListaPessoas();
    }
}
