package com.mrossi.academiadigital.service.impl;

import com.mrossi.academiadigital.entity.Aluno;
import com.mrossi.academiadigital.entity.AvaliacaoFisica;
import com.mrossi.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.mrossi.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.mrossi.academiadigital.repository.AlunoRepository;
import com.mrossi.academiadigital.repository.AvalicaoFisicaRepository;
import com.mrossi.academiadigital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvalicaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvalicaoFisicaRepository avalicaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaofisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaofisica.setAluno(aluno);
        avaliacaofisica.setDataAvaliacao(form.getDataAvaliacao());
        avaliacaofisica.setPeso(form.getPeso());
        avaliacaofisica.setAltura(form.getAltura());

        return avalicaoFisicaRepository.save(avaliacaofisica);
    }

    @Override
    public Optional<AvaliacaoFisica> get(Long id) {
        return avalicaoFisicaRepository.findById(id);
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avalicaoFisicaRepository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }
}
