package com.atividade.atividade.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.atividade.atividade.dtos.NotaDTO;
import com.atividade.atividade.services.NotaService;


@RestController
@RequestMapping(value="/notas")
public class NotaController {
    @Autowired
    private NotaService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<NotaDTO> findById(@PathVariable Long id) {
        NotaDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<NotaDTO> insert(@RequestBody NotaDTO dto) {
    dto = service.insert(dto);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(dto.getId()).toUri();
    return ResponseEntity.created(uri).body(dto);
    }



}

