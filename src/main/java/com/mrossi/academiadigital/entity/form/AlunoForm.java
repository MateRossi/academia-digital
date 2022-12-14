package com.mrossi.academiadigital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

    @NotBlank(message = "Este campo não pode estar vazio.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres.")
    private String nome;

    @NotBlank(message = "Este campo não pode estar vazio.")
    @CPF(message = "'${validatedValue}' é inválido.")
    private String cpf;

    @NotBlank(message = "Este campo não pode estar vazio.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa ter entre {min} e {max} caracteres.")
    private String bairro;

    @NotBlank(message = "Este campo não pode estar vazio.")
    private String dataNascimento;
}
