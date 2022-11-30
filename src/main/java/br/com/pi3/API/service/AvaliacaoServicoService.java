package br.com.pi3.API.service;

import br.com.pi3.API.entity.AvaliacaoServicoEntity;

import java.util.List;
import java.util.Optional;

public interface AvaliacaoServicoService {

    List<AvaliacaoServicoEntity> findAllAvaliacaoServico();
    Optional<AvaliacaoServicoEntity> findById(long id);
    AvaliacaoServicoEntity saveAvaliacaoServico(AvaliacaoServicoEntity avaliacao);
    AvaliacaoServicoEntity updateAvaliacaoServico(AvaliacaoServicoEntity avaliacao);

    Double AvaliacaoServicoMediaPorServico(Long idservico);

    List<AvaliacaoServicoEntity> findAvaliacaoServicoByServicoIdservico(Long idservico);
    void deleteAvaliacaoServico(long id);
}
