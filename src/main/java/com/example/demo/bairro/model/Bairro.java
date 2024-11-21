package com.example.demo.bairro.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "TB_BAIRROS")
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, name = "nomes", length = 150)
    private String nome;

    private int status;

    private int codigoBairro;

    private int codigoMunicipio;

}
