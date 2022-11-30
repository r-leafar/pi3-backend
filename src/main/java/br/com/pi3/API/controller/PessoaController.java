package br.com.pi3.API.controller;

import br.com.pi3.API.dto.LoginAuthDto;
import br.com.pi3.API.dto.LoginSessaoDto;
import br.com.pi3.API.entity.PessoaEntity;
import br.com.pi3.API.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin()
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService service) {
        this.pessoaService = service;
    }
    @GetMapping
    public List<PessoaEntity> findAllPessoa(){
    return pessoaService.findAllPessoa();
    }
    @GetMapping("/{id}")
    public Optional<PessoaEntity> findPessoaById(@PathVariable("id") long id){
        return pessoaService.findById(id);
    }

    @PostMapping
    public PessoaEntity savePessoa(@RequestBody PessoaEntity pessoa){

        return pessoaService.savePessoa(pessoa);
    }
    @PostMapping("/login")
    public LoginSessaoDto authPessoa(@RequestBody LoginAuthDto login){

        PessoaEntity p = pessoaService.authPessoa(login.getEmail(), login.getSenha());

        return LoginSessaoDto.builder().email(p.getEmail()).idpessoa(p.getIdpessoa()).build();
    }

    @PutMapping("/{id}")
    public PessoaEntity updatePessoa(@RequestBody PessoaEntity pessoa,@PathVariable("id") Long id){
        PessoaEntity p = pessoaService.findById(id).get();
        p.setAtivo(pessoa.isAtivo());
        p.setCelular(pessoa.getCelular());
        p.setDoc(pessoa.getDoc());
        p.setDatanascimento(pessoa.getDatanascimento());
        p.setEmail(pessoa.getEmail());
        p.setImagem(pessoa.getImagem());
        p.setSenha(pessoa.getSenha());
        return pessoaService.updatePessoa(p);

    }

    @DeleteMapping("/{id}")
    public void deletePessoa(@PathVariable("id") long id){
        pessoaService.deletePessoa(id);
    }
}
