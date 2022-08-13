package com.mrossi.academiadigital.service.impl;

import com.mrossi.academiadigital.entity.Aluno;
import com.mrossi.academiadigital.entity.AvaliacaoFisica;
import com.mrossi.academiadigital.entity.form.AlunoForm;
import com.mrossi.academiadigital.entity.form.AlunoUpdateForm;
import com.mrossi.academiadigital.repository.AlunoRepository;
import com.mrossi.academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());

        return repository.save(aluno);
    }

    @Override
    public Optional<Aluno> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        Optional<Aluno> aluno = repository.findById(id);
        aluno.get().setNome(formUpdate.getNome());
        aluno.get().setBairro(formUpdate.getBairro());
        aluno.get().setDataNascimento(formUpdate.getDataNascimento());

        return repository.save(aluno.get());
    }

    @Override
    public void delete(Long id) {
        repository.delete(repository.findById(id).get());
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();
    }

}
