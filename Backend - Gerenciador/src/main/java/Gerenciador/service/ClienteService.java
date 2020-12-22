package Gerenciador.service;

import Gerenciador.model.Cliente;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.List;

public interface ClienteService {
    public Cliente salvarCliente(Cliente cliente);
    public List<Cliente> buscarClientes();

    public Cliente consultarClienteByNome(String nomeCliente);
    public Cliente consultarClienteByClienteId(Integer idCliente);

    public void removerClienteById(Integer idCliente);
    public Cliente alterarNomeClienteById(Integer idCliente, String novoNome);
}
