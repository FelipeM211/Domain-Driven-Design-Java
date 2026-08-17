package br.com.fiap.bean;

import exceptions.SaldoInsuficienteException;

public class ContaBancaria {
    private double saldo;
    public ContaBancaria(){

    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double quantia) throws SaldoInsuficienteException {
        if (quantia > saldo) {
            throw new SaldoInsuficienteException("Saldo Insuficiente para realizar o saque");
        }
        saldo -= quantia;
    }
}
