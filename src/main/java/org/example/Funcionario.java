package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

//2
public class Funcionario extends Pessoa {
    BigDecimal salario;
    String funcao;

    Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }
}
