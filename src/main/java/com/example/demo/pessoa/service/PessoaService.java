package com.example.demo.pessoa.service;


import com.example.demo.pessoa.dto.PessoaDto;
import com.example.demo.pessoa.model.Pessoa;
import com.example.demo.pessoa.repository.PessoaRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    public PessoaService(PessoaRepository pessoaRepository, ModelMapper modelMapper) {
        this.pessoaRepository = pessoaRepository;
        this.modelMapper = modelMapper;
    }

    public PessoaDto criarPessoa(PessoaDto pessoaDto) {
        Pessoa pessoa = modelMapper.map(pessoaDto, Pessoa.class);
        Pessoa pessoaSalva = pessoaRepository.save(pessoa);
        return modelMapper.map(pessoaSalva, PessoaDto.class);
    }
}
