package br.com.pi3.API.controller;

import br.com.pi3.API.entity.ServicoEntity;
import br.com.pi3.API.service.ServicoService;
import br.com.pi3.API.service.implementation.MinioServiceImplementation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin()
@RequestMapping("/servico")
public class ServicoController {

    private final ServicoService servicoService;
    private final MinioServiceImplementation minioService;

    public ServicoController(ServicoService service, MinioServiceImplementation minioService) {
        this.servicoService = service;
        this.minioService = minioService;
    }
    @GetMapping
    public List<ServicoEntity> findAllServico(){
        return servicoService.findAllServico();
    }

    @GetMapping("/{id}")
    public Optional<ServicoEntity> findServicoById(@PathVariable long id)
    {
        ServicoEntity servicoEntity = servicoService.findById(id).get();
        if(servicoEntity!= null){
            servicoEntity.setImagem(minioService.getPreSignedUrl(servicoEntity.getImagem()));
        }
return Optional.of(servicoEntity);
    }

    @PostMapping
    public ServicoEntity saveServico(@RequestBody ServicoEntity servico){
        return servicoService.saveServico(servico);
    }

    @GetMapping("/{id}/segmento")
    public List<ServicoEntity> findServicoBySegmento(@PathVariable Long id){
        List<ServicoEntity> listServices = servicoService.findServicoBySegmentoIdsegmento(id);
        for(ServicoEntity s:listServices ){
            if(s.getImagem()!=null) {
                s.setImagem(minioService.getPreSignedUrl(s.getImagem()));
            }
        }

        return listServices;
    }
    @PutMapping("/{id}")
    public ServicoEntity updateServico(@PathVariable long id,@RequestBody ServicoEntity servico){
        ServicoEntity s = servicoService.findById(id).get();
        s.setEspecialidade(servico.getEspecialidade());
        s.setDescricao(servico.getDescricao());
        return servicoService.updateServico(s);
    }
    @DeleteMapping("/{id}")
    public void deleteServico(@PathVariable long id){
        servicoService.deleteServico(id);
    }
}
