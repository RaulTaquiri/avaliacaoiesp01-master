package br.com.iesp.avaliacao.api.Repository;

import br.com.iesp.avaliacao.api.model.AvaliacaoFinal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FinalRepository extends JpaRepository<AvaliacaoFinal, Integer> {
}