package Gerenciador.repository;

import Gerenciador.model.Cidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends CrudRepository<Cidade, Integer> {
    public List<Cidade> findAll();
    public Cidade findByNome(String nomeCidade);
    public List<Cidade> findAllByEstado(String nomeEstado);
}
