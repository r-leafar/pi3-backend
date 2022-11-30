package br.com.pi3.API.repository;

import br.com.pi3.API.entity.AvaliacaoServicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvaliacaoServicoRepository extends JpaRepository<AvaliacaoServicoEntity,Long> {

    @Query("select AVG (avaliacao.nota) from AvaliacaoServicoEntity avaliacao where avaliacao.servico.idservico=?1")
    public  Double AvaliacaoServicoMediaPorServico (Long idservico);

    public List<AvaliacaoServicoEntity> findAvaliacaoServicoByServicoIdservico(Long idservico);
}
