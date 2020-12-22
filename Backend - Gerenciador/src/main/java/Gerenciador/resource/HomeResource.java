package Gerenciador.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeResource {
    @GetMapping
    public String getPaginaInicial() {
        return "Pagina Inicial";
    }
}


