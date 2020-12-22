package Gerenciador.service.impl;

import Gerenciador.model.Cidade;
import Gerenciador.repository.CidadeRepository;
import Gerenciador.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeServiceImpl implements CidadeService {
    private final CidadeRepository cidadeRepository;

    @Autowired
    public CidadeServiceImpl(CidadeRepository cidadeRepository){
        this.cidadeRepository = cidadeRepository;
    }

    @Override
    public Cidade salvarCidade(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    @Override
    public List<Cidade> buscarCidades(){
        return cidadeRepository.findAll();
    }

    public Cidade consultarCidadeByNome(String nomeCidade){
        return cidadeRepository.findByNome(nomeCidade);
    }

    public List<Cidade> consultarCidadesByEstado(String nomeEstado){
        return cidadeRepository.findAllByEstado(nomeEstado);
    }
}
