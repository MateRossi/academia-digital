package com.mrossi.academiadigital.service;

import com.mrossi.academiadigital.entity.Aluno;
import com.mrossi.academiadigital.entity.AvaliacaoFisica;
import com.mrossi.academiadigital.entity.form.AlunoForm;
import com.mrossi.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll ();

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id);
}
