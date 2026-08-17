package br.com.fiap.main;

import br.com.fiap.bean.ContaBancaria;
import exceptions.SaldoInsuficienteException;

public class MainContaBancaria {
    static void main() {
        ContaBancaria conta = new ContaBancaria(5000);

        System.out.println("Saldo: " + conta.getSaldo());
        try {
            conta.sacar(1000);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Ero : " + e.getMessage());
        }
        System.out.println("Saldo Atual: " + conta.getSaldo());
    }
}
