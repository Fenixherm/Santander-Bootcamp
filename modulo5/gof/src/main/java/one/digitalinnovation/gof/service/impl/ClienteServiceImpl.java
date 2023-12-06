package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author falvojr
 */
@Service
public class ClienteServiceImpl implements ClienteService {
    //TODO Singleton: Injetar componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;
    //por ter um @FeignClient e um método Get ja é considerado um componente spring

    //TODO Strategy: implementar os métodos definidos na interface.
    //TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
    @Override
    public Iterable<Cliente> buscarTodos() {
        //FIXME buscar todos clientes
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //FIXME Buscar Cliente por ID.
        Optional<Cliente> cliente = clienteRepository.findById(id);

        return cliente.get();
    }


    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    //Método chamado via Callback para não precisar repetir código.
    private void salvarClienteComCep(Cliente cliente) {
        //FIXME Verificar se o Endereco do Cliente já existe (pelo CEP).
        //Busca o CEP do cliente e atribui a uma variavel
        String cep = cliente.getEndereco().getCep();


        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });

        cliente.setEndereco(endereco); //Vincula o endereço ao cliente
        //FIXME Inserir Cliente, vinculando o Endereço(Novo ou existente).
        clienteRepository.save(cliente); //salva o cliente no banco, no qual será gerado um ID automaticamente.
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        //FIXME Buscar cliente por ID, caso exista:
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        //se presente no banco de dados.
        if(clienteBd.isPresent()){
            //FIXME verificar se o endereco do Cliente já existe(pelo CEP).
            //FIXME Inserir Cliente, vinculando o novo Endereco (novo ou existente).
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        //FIXME Deletar Cliente por ID
        clienteRepository.delete(buscarPorId(id));
    }
}
