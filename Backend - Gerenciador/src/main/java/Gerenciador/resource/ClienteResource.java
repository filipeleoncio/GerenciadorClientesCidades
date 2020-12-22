package Gerenciador.resource;

import Gerenciador.model.Cidade;
import Gerenciador.model.Cliente;
import Gerenciador.repository.CidadeRepository;
import Gerenciador.service.CidadeService;
import Gerenciador.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
    private final ClienteService clienteService;

    @Autowired
    public ClienteResource(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> buscarClientes(){
        return clienteService.buscarClientes();
    }

    @GetMapping("/consultarClientePorNome")
    public Cliente consultarClienteByNome(@RequestParam String nomeCliente){
        return clienteService.consultarClienteByNome(nomeCliente);
    }

    @GetMapping("/consultarClientePorClienteId")
    public Cliente consultarClienteByClienteId(@RequestParam Integer idCliente){
        return clienteService.consultarClienteByClienteId(idCliente);
    }

    @PostMapping
    public Cliente salvarCliente(@RequestBody Cliente cliente){//, @RequestParam Integer idCidade){
        //cliente.setCidadeResidente(cidade);
        //CidadeRepository
        return clienteService.salvarCliente(cliente);
    }

    @PutMapping
    public Cliente alterarNomeClienteById(@RequestParam Integer idCliente, @RequestParam String novoNome){
        return clienteService.alterarNomeClienteById(idCliente, novoNome);
    }

    @DeleteMapping
    public void removerClienteById(@RequestParam Integer idCliente){
        clienteService.removerClienteById(idCliente);
    }
}
