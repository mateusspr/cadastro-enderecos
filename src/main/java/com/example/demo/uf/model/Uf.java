package com.example.demo.uf.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "TB_UFs")
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Uf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, name = "nomes", length = 150)
    private String nome;

    private String sigla;

    private int status;

}
