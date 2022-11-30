package br.com.pi3.API.service;

import br.com.pi3.API.entity.ServicoEntity;

import java.util.List;
import java.util.Optional;

public interface ServicoService {
    List<ServicoEntity> findAllServico();
    Optional<ServicoEntity> findById(long id);
    ServicoEntity saveServico(ServicoEntity segmento);
    ServicoEntity updateServico(ServicoEntity segmento);

    List<ServicoEntity> findServicoBySegmentoIdsegmento(Long id);
    void deleteServico(long id);
}
