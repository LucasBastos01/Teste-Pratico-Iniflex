package org.example;

import java.time.LocalDate;

//1
public class Pessoa {
    String nome;
    LocalDate dataNascimento;

    Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
