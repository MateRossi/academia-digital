package com.mrossi.academiadigital.service;

import com.mrossi.academiadigital.entity.AvaliacaoFisica;
import com.mrossi.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.mrossi.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;
import java.util.Optional;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    Optional<AvaliacaoFisica> get(Long id);

    List<AvaliacaoFisica> getAll ();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
