package com.mrossi.academiadigital.controller;

import com.mrossi.academiadigital.entity.AvaliacaoFisica;
import com.mrossi.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.mrossi.academiadigital.service.impl.AvalicaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    AvalicaoFisicaServiceImpl service;

    @GetMapping
    public List<AvaliacaoFisica> getAll (){
        return service.getAll();
    }

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }

}
