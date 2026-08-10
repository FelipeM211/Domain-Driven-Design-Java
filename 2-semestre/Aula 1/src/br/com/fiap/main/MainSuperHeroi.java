package br.com.fiap.main;

import br.com.fiap.bean.SuperHeroi;

import javax.swing.JOptionPane;

public class MainSuperHeroi {
    static void main(String[] args) {
        SuperHeroi heroi;
        String nome;
        String idSecreta;
        String[] poderes;
        String[] fraquezas;
        int qtdePoderes;
        int qtdeFraquezas;

        do {
            try {
                nome = JOptionPane.showInputDialog("Digite o nome do super-herói");
                idSecreta = JOptionPane.showInputDialog("Digite a identidade secreta");

                qtdePoderes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de poderes?"));
                qtdeFraquezas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de fraquezas?"));

                poderes = new String[qtdePoderes];
                for (int i = 0; i < poderes.length; i++) {
                    poderes[i] = JOptionPane.showInputDialog(String.format("Poder %d:", (i + 1)));
                }

                fraquezas = new String[qtdeFraquezas];
                for (int i = 0; i < fraquezas.length; i++) {
                    fraquezas[i] = JOptionPane.showInputDialog(String.format("Fraqueza %d:", (i + 1)));
                }

                heroi = new SuperHeroi(nome, idSecreta, poderes, fraquezas);
                heroi.listarHeroi();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}