package br.com.iesp.avaliacao.api.Resource;

import br.com.iesp.avaliacao.api.Service.FinalService;
import br.com.iesp.avaliacao.api.model.AvaliacaoFinal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/final")

public class FinalResource {

    private FinalService service;

    public FinalResource(FinalService service) {
        this.service = service;
    }

    @PostMapping
    public AvaliacaoFinal salvar(@RequestBody AvaliacaoFinal avaliacaoFinal){
        return service.salvar(avaliacaoFinal);
    }

    @PutMapping("/atualizar")
    public void atualizar(AvaliacaoFinal avaliacao){
        service.salvar(avaliacao);
    }


    @DeleteMapping("/{nome}")
    public void remover(@PathVariable int nome){
        service.remover(nome);
    }



    @GetMapping
    public List<AvaliacaoFinal> listar(){
        return service.listar();
    }

}

