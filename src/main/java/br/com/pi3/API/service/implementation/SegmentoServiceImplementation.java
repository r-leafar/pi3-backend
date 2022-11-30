package br.com.pi3.API.service.implementation;

import br.com.pi3.API.entity.SegmentoEntity;
import br.com.pi3.API.repository.SegmentoRepository;
import br.com.pi3.API.service.SegmentoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SegmentoServiceImplementation implements SegmentoService {

    private final SegmentoRepository repository;

    public SegmentoServiceImplementation(SegmentoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<SegmentoEntity> findAllSegmento() {
        return repository.findAll();
    }

    @Override
    public Optional<SegmentoEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public SegmentoEntity saveSegmento(SegmentoEntity segmento) {
        return repository.save(segmento);
    }

    @Override
    public SegmentoEntity updateSegmento(SegmentoEntity segmento) {
        return repository.save(segmento);
    }

    @Override
    public void deleteSegmento(Long id) {
        repository.deleteById(id);
    }
}
