package br.com.pi3.API.controller;

import br.com.pi3.API.dto.MinioDto;
import br.com.pi3.API.service.implementation.MinioServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
@RequestMapping("/file")
public class MinioController {

    @Autowired
    private MinioServiceImplementation minioService;

    @GetMapping
    public ResponseEntity<Object> getFiles() {
        return ResponseEntity.ok(minioService.getListObjects());
    }

    @PostMapping("/upload")
    public ResponseEntity<Object> upload(@ModelAttribute MinioDto request) {
        return ResponseEntity.ok().body(minioService.uploadFile(request));
    }
}
