package br.com.pi3.API.repository;

import br.com.pi3.API.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity,Long> {

    PessoaEntity findByEmailAndAndSenha(String email,String senha);
}
