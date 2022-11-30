package br.com.pi3.API.service;

import br.com.pi3.API.entity.PessoaEntity;

import java.util.List;
import java.util.Optional;

public interface PessoaService {

    List<PessoaEntity> findAllPessoa();
    Optional<PessoaEntity> findById(long id);
    PessoaEntity savePessoa(PessoaEntity pessoa);
    PessoaEntity updatePessoa(PessoaEntity pessoa);
    void deletePessoa(long id);

    PessoaEntity authPessoa(String email,String senha);

}
