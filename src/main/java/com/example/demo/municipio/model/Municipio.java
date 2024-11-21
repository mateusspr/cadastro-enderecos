package com.example.demo.municipio.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "TB_MUNICIPIOS")
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Municipio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, name = "nomes", length = 150)
    private String nome;

    private int status;

    private int codigoMunicipio;

    private int codigoUf;

}
