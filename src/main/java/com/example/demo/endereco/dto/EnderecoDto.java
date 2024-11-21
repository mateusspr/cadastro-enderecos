package com.example.demo.endereco.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoDto {

    private Long codigoBairro;
    private String nomeRua;
    private String numero;
    private String complemento;
    private String cep;
}
