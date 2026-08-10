package br.com.fiap;

import javax.swing.*;

public class CirculoJOP {
    public static void main(String[] args) {
        double raio, area;
        String auxilar;
        try {
            auxilar = JOptionPane.showInputDialog("Digite o valor do raio de um círculo");
            raio = Double.parseDouble(auxilar);
            area = Math.PI * Math.pow(raio, 2);
            JOptionPane.showMessageDialog(null, "Área do Círculo: " + area);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto");
        }
    }
}
