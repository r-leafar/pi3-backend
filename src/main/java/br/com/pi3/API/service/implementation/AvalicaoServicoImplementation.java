package br.com.pi3.API.service.implementation;

import br.com.pi3.API.entity.AvaliacaoServicoEntity;
import br.com.pi3.API.repository.AvaliacaoServicoRepository;
import br.com.pi3.API.service.AvaliacaoServicoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvalicaoServicoImplementation implements AvaliacaoServicoService {

    private final AvaliacaoServicoRepository repository;

    public AvalicaoServicoImplementation(AvaliacaoServicoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AvaliacaoServicoEntity> findAllAvaliacaoServico() {
        return repository.findAll();
    }

    @Override
    public Optional<AvaliacaoServicoEntity> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public AvaliacaoServicoEntity saveAvaliacaoServico(AvaliacaoServicoEntity avaliacao) {
        return repository.save(avaliacao);
    }

    @Override
    public AvaliacaoServicoEntity updateAvaliacaoServico(AvaliacaoServicoEntity avaliacao) {
        return repository.save(avaliacao);
    }

    @Override
    public Double AvaliacaoServicoMediaPorServico(Long idservico) {
        return repository.AvaliacaoServicoMediaPorServico(idservico);
    }


    @Override
    public List<AvaliacaoServicoEntity> findAvaliacaoServicoByServicoIdservico(Long idservico) {
        return repository.findAvaliacaoServicoByServicoIdservico(idservico);
    }

    @Override
    public void deleteAvaliacaoServico(long id) {
    repository.deleteById(id);
    }
}
