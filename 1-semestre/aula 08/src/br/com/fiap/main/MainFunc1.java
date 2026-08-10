package br.com.fiap.main;

import br.com.fiap.bean.Funcionarios;

import java.time.LocalDate;

public class MainFunc1 {
    public static void main(String[] args) {
        Funcionarios funcionarios1 = new Funcionarios();
        funcionarios1.setNome("Astrogildo");
        funcionarios1.setValorHoraTrabalho(15.75f);
        LocalDate dataAtual = LocalDate.now();
        System.out.printf("Data : %d/%s/%d\nNome: %s\nSalário: R$ %.2f", dataAtual.getDayOfMonth(), dataAtual.getMonth(),dataAtual.getYear(),funcionarios1.getNome(),funcionarios1.calcularSalario(20));
    }
}
