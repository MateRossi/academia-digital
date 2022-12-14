package com.mrossi.academiadigital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaForm {

    private Long alunoId;
    private String dataMatricula;
}
