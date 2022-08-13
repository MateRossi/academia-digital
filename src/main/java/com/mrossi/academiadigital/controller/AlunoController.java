package com.mrossi.academiadigital.controller;


import com.mrossi.academiadigital.entity.Aluno;
import com.mrossi.academiadigital.entity.AvaliacaoFisica;
import com.mrossi.academiadigital.entity.form.AlunoForm;
import com.mrossi.academiadigital.entity.form.AlunoUpdateForm;
import com.mrossi.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Aluno> get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public Aluno update(@PathVariable("id") Long id, @RequestBody AlunoUpdateForm form) {
        return service.update(id, form);
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping("/{id}/avaliacoes")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable("id") Long id) {
        return service.getAllAvaliacaoFisica(id);
    }
}
