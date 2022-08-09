package com.mrossi.academiadigital.service;

import com.mrossi.academiadigital.entity.Matricula;
import com.mrossi.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll ();

    void delete(Long id);
}
