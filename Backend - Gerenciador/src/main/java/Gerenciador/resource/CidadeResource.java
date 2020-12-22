package Gerenciador.resource;

import Gerenciador.model.Cidade;
import Gerenciador.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeResource {
    private final CidadeService cidadeService;

    @Autowired
    public CidadeResource(CidadeService cidadeService){
        this.cidadeService = cidadeService;
    }

    @GetMapping
    public List<Cidade> buscarCidades(){
        return cidadeService.buscarCidades();
    }

    @GetMapping("/consultarCidadePorNome")
    public Cidade consultarCidadeByNome(@RequestParam String nomeCidade){
        return cidadeService.consultarCidadeByNome(nomeCidade);
    }

    @GetMapping("/consultarCidadesPorEstado")
    public List<Cidade> consultarCidadesByEstado(@RequestParam String nomeEstado){
        return cidadeService.consultarCidadesByEstado(nomeEstado);
    }

    @PostMapping
    public Cidade salvarCidade(@RequestBody Cidade cidade){
        return cidadeService.salvarCidade(cidade);
    }

}
