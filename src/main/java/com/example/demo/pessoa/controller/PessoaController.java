package com.example.demo.pessoa.controller;

import com.example.demo.pessoa.dto.PessoaDto;
import com.example.demo.pessoa.service.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
@AllArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<PessoaDto> criarPessoa(@RequestBody PessoaDto pessoaDto){
        PessoaDto pessoaCriada = pessoaService.criarPessoa(pessoaDto);
        return ResponseEntity.ok(pessoaDto);
    }

    // create method for get all people

}
