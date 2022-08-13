package com.mrossi.academiadigital.service;

import com.mrossi.academiadigital.entity.Matricula;
import com.mrossi.academiadigital.entity.form.MatriculaForm;

import java.util.List;
import java.util.Optional;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Optional<Matricula> get(Long id);

    List<Matricula> getAll ();

    void delete(Long id);
}
