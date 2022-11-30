package br.com.pi3.API.service.implementation;

import br.com.pi3.API.entity.ServicoEntity;
import br.com.pi3.API.repository.SegmentoRepository;
import br.com.pi3.API.repository.ServicoRepository;
import br.com.pi3.API.service.ServicoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoServiceImplementation implements ServicoService {

    private final ServicoRepository repository;

    public ServicoServiceImplementation(ServicoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ServicoEntity> findAllServico() {
        return repository.findAll();
    }

    @Override
    public Optional<ServicoEntity> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public ServicoEntity saveServico(ServicoEntity segmento) {
        return repository.save(segmento);
    }

    @Override
    public ServicoEntity updateServico(ServicoEntity segmento) {
        return repository.save(segmento);
    }

    @Override
    public List<ServicoEntity> findServicoBySegmentoIdsegmento(Long id) {
        return repository.findServicoEntitiesBySegmentoIdsegmento(id);
    }

    @Override
    public void deleteServico(long id) {
        repository.deleteById(id);
    }
}
