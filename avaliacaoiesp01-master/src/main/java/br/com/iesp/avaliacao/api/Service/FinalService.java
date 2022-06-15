package br.com.iesp.avaliacao.api.Service;


import br.com.iesp.avaliacao.api.Repository.FinalRepository;
import br.com.iesp.avaliacao.api.model.AvaliacaoFinal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinalService {

    @Autowired
    private FinalRepository repository;

    public FinalService(FinalRepository repository) {
        this.repository = repository;
    }


    public AvaliacaoFinal salvar(AvaliacaoFinal avaliacaoFinal) {
        return repository.save(avaliacaoFinal);
    }

    public void remover(int nome){
        repository.deleteById(nome);
    }

    public List<AvaliacaoFinal> listar() {
        return repository.findAll();
    }
}
