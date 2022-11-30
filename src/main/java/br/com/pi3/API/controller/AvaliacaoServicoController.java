package br.com.pi3.API.controller;

import br.com.pi3.API.entity.AvaliacaoServicoEntity;

import br.com.pi3.API.service.AvaliacaoServicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin()
@RequestMapping("/avaliacao-servico")
public class AvaliacaoServicoController {

    private final AvaliacaoServicoService service;

    public AvaliacaoServicoController(AvaliacaoServicoService service) {
        this.service = service;
    }

    @GetMapping()
    public List<AvaliacaoServicoEntity> findAllAvalicaoServico(){
       return  service.findAllAvaliacaoServico();
    }
    @GetMapping("/{id}")
    public Optional<AvaliacaoServicoEntity> findAvaliacaoServicoById(@PathVariable long id){
        return service.findById(id);
    }
    @GetMapping("/{idservico}/servico")
    public List<AvaliacaoServicoEntity> findAvaliacaoServicoByServicoIdservico(@PathVariable long idservico){
    return  service.findAvaliacaoServicoByServicoIdservico(idservico);
    }
    @PostMapping
    public AvaliacaoServicoEntity saveAvaliacaoServico(@RequestBody AvaliacaoServicoEntity avaliacaoServico){
        return service.saveAvaliacaoServico(avaliacaoServico);
    }
    @GetMapping("/{idservico}/avaliacao")
    public Double AvaliacaoServicoMediaPorServico(@PathVariable Long idservico){
        return service.AvaliacaoServicoMediaPorServico(idservico);
    }
    @PutMapping("/{id}")
    public AvaliacaoServicoEntity updateAvaliacaoServico(@PathVariable long id,@RequestBody AvaliacaoServicoEntity avaliacaoServico){
        Optional<AvaliacaoServicoEntity> obj = service.findById(id);
        obj.get().setComentario(avaliacaoServico.getComentario());
        obj.get().setNota(avaliacaoServico.getNota());
        return service.updateAvaliacaoServico(obj.get());
    }
    @DeleteMapping("/{id}")
    public void deleteAvaliacaoServico(@PathVariable long id){
        service.deleteAvaliacaoServico(id);
    }
}
