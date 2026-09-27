package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//3
public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

//        3.1
        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

//        3.2
        funcionarios.removeIf(funcionario -> funcionario.nome.equals("João"));

//        3.3 - Consegui imprimir as informações, porém não soube realizar a formatação solicitada para data e valores.
        for (Funcionario funcionario: funcionarios) {
            System.out.println("Nome: " + funcionario.nome + " - Data de Nascimento: " + funcionario.dataNascimento + " - Salário: " + funcionario.salario + " - Função: " + funcionario.funcao);
        }

//        3.4
        for (Funcionario funcionario: funcionarios) {
            BigDecimal reajusteFinal = funcionario.salario.multiply(new BigDecimal("0.10"));
            funcionario.salario =  funcionario.salario.add(reajusteFinal);
            System.out.println("Nome: " + funcionario.nome + " - Data de Nascimento: " + funcionario.dataNascimento + " - Salário: " + funcionario.salario + " - Função: " + funcionario.funcao);
        }

//        3.5 - Não soube realizar o agrupamento dos funcionários por função utilizando Map.

//        3.6 - Não desenvolvido, pois depende do agrupamento realizado no item anterior.

//        3.8
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.dataNascimento.getMonthValue() == 10 || funcionario.dataNascimento.getMonthValue() == 12) {
                System.out.println("Nome: " + funcionario.nome + " - Data de Nascimento: " + funcionario.dataNascimento + " - Salário: " + funcionario.salario + " - Função: " + funcionario.funcao);
            }
        }


//        3.9
        int maiorIdade = 0;
        String nomeMaisVelho = "";
        for (Funcionario funcionario : funcionarios) {

            int idade = LocalDate.now().getYear() - funcionario.dataNascimento.getYear();

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomeMaisVelho = funcionario.nome;
            }
        }
        System.out.println("Nome: " + nomeMaisVelho + " - Idade: " + maiorIdade);

//        3.10 - Sei que preciso ordenar a lista, porém não lembrei como realizar a comparação utilizando o atributo nome.

//        3.11
        BigDecimal salarioTotal = BigDecimal.ZERO;
        for (Funcionario funcionario : funcionarios) {
            salarioTotal = salarioTotal.add(funcionario.salario);
        }
        System.out.println("Total dos salários: " + salarioTotal);

//        3.12
        for (Funcionario funcionario : funcionarios) {
            BigDecimal quantidadeSalarioMinimo = funcionario.salario.divide(new BigDecimal("1212.00"), 2, RoundingMode.HALF_UP);
            System.out.println("Quantidade de vezes que o funcionário " + funcionario.nome + " ganha um salário mínimo: " + quantidadeSalarioMinimo);
        }

    }
}