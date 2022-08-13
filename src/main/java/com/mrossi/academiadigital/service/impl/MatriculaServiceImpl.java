package com.mrossi.academiadigital.service.impl;

import com.mrossi.academiadigital.entity.Aluno;
import com.mrossi.academiadigital.entity.Matricula;
import com.mrossi.academiadigital.entity.form.MatriculaForm;
import com.mrossi.academiadigital.repository.AlunoRepository;
import com.mrossi.academiadigital.repository.MatriculaRepository;
import com.mrossi.academiadigital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    MatriculaRepository matriculaRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);
        matricula.setDataMatricula(form.getDataMatricula());

        return matriculaRepository.save(matricula);
    }

    @Override
    public Optional<Matricula> get(Long id) {
        return matriculaRepository.findById(id);
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {

    }
}
