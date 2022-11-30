package br.com.pi3.API.controller;


import br.com.pi3.API.entity.SegmentoEntity;
import br.com.pi3.API.service.SegmentoService;
import br.com.pi3.API.service.implementation.MinioServiceImplementation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin()
@RequestMapping("/segmento")
public class SegmentoController {

    private final SegmentoService segmentoService;
    private final MinioServiceImplementation minioService;


    public SegmentoController(SegmentoService service, MinioServiceImplementation minioService) {
        this.segmentoService = service;
        this.minioService = minioService;
    }
    @GetMapping
    public List<SegmentoEntity> findAllSegmento(){
        List<SegmentoEntity> lista =  segmentoService.findAllSegmento();
        for(SegmentoEntity s:lista){
            if(s.getImagem()!=null){
                s.setImagem(minioService.getPreSignedUrl(s.getImagem()));
            }
        }
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<SegmentoEntity> findSegmentoById(@PathVariable long id){
        return segmentoService.findById(id);
    }

    @PostMapping
    public SegmentoEntity saveSegmento(@RequestBody SegmentoEntity segmento){
        return segmentoService.saveSegmento(segmento);
    }
    @PutMapping("/{id}")
    public SegmentoEntity updateSegmento(@PathVariable long id,@RequestBody SegmentoEntity segmento){
        SegmentoEntity s = segmentoService.findById(id).get();
        s.setNome(segmento.getNome());
        s.setDescricao(segmento.getDescricao());
        return segmentoService.updateSegmento(s);
    }
    @DeleteMapping("/{id}")
    public void deleteSegmento(@PathVariable long id){
        segmentoService.deleteSegmento(id);
    }

}
