package Gerenciador.service.impl;

import Gerenciador.model.Cliente;
import Gerenciador.repository.ClienteRepository;
import Gerenciador.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente salvarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> salvarListaClientes(List<Cliente> clientes) {
        return (List<Cliente>) clienteRepository.saveAll(clientes);
    }

    @Override
    public List<Cliente> buscarClientes(){
        return clienteRepository.findAll();
    }

    @Override
    public Cliente consultarClienteByNome(String nomeCliente){
        return clienteRepository.findByNome(nomeCliente);
    }

    @Override
    public Cliente consultarClienteByClienteId(Integer idCliente){
        return clienteRepository.findByClienteId(idCliente);
    }

    @Override
    public void removerClienteById(Integer idCliente){
        clienteRepository.deleteById(idCliente);
    }

    @Override
    public Cliente alterarNomeClienteById(Integer idCliente, String novoNome){
        Cliente c = clienteRepository.findByClienteId(idCliente);
        c.setNome(novoNome);
        return clienteRepository.save(c);
    }
}
