package Gerenciador.service;

import Gerenciador.model.Cidade;

import java.util.List;

public interface CidadeService {
    public Cidade salvarCidade(Cidade cidade);
    public List<Cidade> buscarCidades();

    public Cidade consultarCidadeByNome(String nomeCidade);
    public List<Cidade> consultarCidadesByEstado(String nomeEstado);
}
