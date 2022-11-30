package br.com.pi3.API.service;



import br.com.pi3.API.entity.SegmentoEntity;
import java.util.List;
import java.util.Optional;

public interface SegmentoService {

    List<SegmentoEntity> findAllSegmento();
    Optional<SegmentoEntity> findById(Long id);
    SegmentoEntity saveSegmento(SegmentoEntity segmento);
    SegmentoEntity updateSegmento(SegmentoEntity segmento);
    void deleteSegmento(Long id);
}
