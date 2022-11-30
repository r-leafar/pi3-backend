package br.com.pi3.API.service.implementation;

import br.com.pi3.API.entity.PessoaEntity;
import br.com.pi3.API.repository.PessoaRepository;
import br.com.pi3.API.repository.SegmentoRepository;
import br.com.pi3.API.service.PessoaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImplementation implements PessoaService {

    private final PessoaRepository repository;

    public PessoaServiceImplementation(PessoaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PessoaEntity> findAllPessoa() {
        return repository.findAll();
    }

    @Override
    public Optional<PessoaEntity> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public PessoaEntity savePessoa(PessoaEntity pessoa) {
        return repository.save(pessoa);
    }

    public  PessoaEntity authPessoa(String email, String senha){
        return repository.findByEmailAndAndSenha(email,senha);
    }

    @Override
    public PessoaEntity updatePessoa(PessoaEntity pessoa) {
        return repository.save(pessoa);
    }

    @Override
    public void deletePessoa(long id) {
    repository.deleteById(id);
    }
}
