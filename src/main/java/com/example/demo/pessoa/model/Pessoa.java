package com.example.demo.pessoa.model;


import com.example.demo.endereco.model.Endereco;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "TB_PESSOAS")
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, name = "nomes", length = 150)
    private String nome;

    private String sobrenome;

    private int idade;

    private String login;

    private String senha;

    private int status;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private List<Endereco> enderecos;
}
