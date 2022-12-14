package com.mrossi.academiadigital.controller;

import com.mrossi.academiadigital.entity.Matricula;
import com.mrossi.academiadigital.entity.form.MatriculaForm;
import com.mrossi.academiadigital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @GetMapping
    public List<Matricula> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Matricula> get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
    @PostMapping
    public Matricula create (@RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping("/bairro")
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAll(bairro);
    }
}
