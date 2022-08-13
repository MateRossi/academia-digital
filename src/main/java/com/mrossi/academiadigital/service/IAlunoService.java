package com.mrossi.academiadigital.service;

import com.mrossi.academiadigital.entity.Aluno;
import com.mrossi.academiadigital.entity.AvaliacaoFisica;
import com.mrossi.academiadigital.entity.form.AlunoForm;
import com.mrossi.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;
import java.util.Optional;

public interface IAlunoService {

    Aluno create(AlunoForm form);

    Optional<Aluno> get(Long id);

    List<Aluno> getAll ();

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id);
}
