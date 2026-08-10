package br.com.fiap;

import javax.swing.*;

public class IdadeJOP {
    public static void main(String[] args) {
        int anoAtual, anoDeNascimento, idade;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual");
            anoAtual = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o ano de nascimento");
            anoDeNascimento = Integer.parseInt(auxiliar);
            idade = anoAtual - anoDeNascimento;
            JOptionPane.showMessageDialog(null, "Idade: " + idade);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }
}
