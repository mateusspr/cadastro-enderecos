package com.example.demo.pessoa.dto;

import com.example.demo.endereco.dto.EnderecoDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PessoaDto {

    private String nome;
    private String sobrenome;
    private int idade;
    private String login;
    private String senha;
    private int status;
    private List<EnderecoDto> enderecos;
}
