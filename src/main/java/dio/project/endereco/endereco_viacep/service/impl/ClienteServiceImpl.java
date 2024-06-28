package dio.project.endereco.endereco_viacep.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.project.endereco.endereco_viacep.model.Cliente;
import dio.project.endereco.endereco_viacep.model.ClienteRepository;
import dio.project.endereco.endereco_viacep.model.Endereco;
import dio.project.endereco.endereco_viacep.model.EnderecoRepository;
import dio.project.endereco.endereco_viacep.service.ClienteService;
import dio.project.endereco.endereco_viacep.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        //criar regra para se o cliente não existir
       Optional<Cliente> cliente = clienteRepository.findById(id);
       return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarCliente(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
       Optional<Cliente> clienteBd = clienteRepository.findById(id);
       if(clienteBd.isPresent()){
        salvarCliente(cliente);
       }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
    
    private void salvarCliente (Cliente cliente){

        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
