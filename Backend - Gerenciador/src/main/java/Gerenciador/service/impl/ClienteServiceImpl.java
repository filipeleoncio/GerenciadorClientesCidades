package Gerenciador.service.impl;

import Gerenciador.model.Cliente;
import Gerenciador.repository.ClienteRepository;
import Gerenciador.service.ClienteService;
import com.sun.xml.bind.v2.model.core.ID;
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
    public List<Cliente> buscarClientes(){
        return clienteRepository.findAll();
    }

    public Cliente consultarClienteByNome(String nomeCliente){
        return clienteRepository.findByNome(nomeCliente);
    }

    public Cliente consultarClienteByClienteId(Integer idCliente){
        return clienteRepository.findByClienteId(idCliente);
    }

    public void removerClienteById(Integer idCliente){
        clienteRepository.deleteById(idCliente);
    }

    public Cliente alterarNomeClienteById(Integer idCliente, String novoNome){
        Cliente c = clienteRepository.findByClienteId(idCliente);
        c.setNome(novoNome);
        return clienteRepository.save(c);
    }
}
