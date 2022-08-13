package com.mrossi.academiadigital.controller;

import com.mrossi.academiadigital.entity.AvaliacaoFisica;
import com.mrossi.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.mrossi.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.mrossi.academiadigital.service.impl.AvalicaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvalicaoFisicaServiceImpl service;

    @GetMapping
    public List<AvaliacaoFisica> getAll (){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<AvaliacaoFisica> get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public AvaliacaoFisica update(@PathVariable("id") Long id, @RequestBody AvaliacaoFisicaUpdateForm form) {
        return service.update(id, form);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }

}
