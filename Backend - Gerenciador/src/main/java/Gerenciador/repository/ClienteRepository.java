package Gerenciador.repository;

import Gerenciador.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    public List<Cliente> findAll();
    public Cliente findByNome(String nomeCliente);
    public Cliente findByClienteId(Integer idCliente);
}
