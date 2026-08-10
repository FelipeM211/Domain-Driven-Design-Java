package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class SuperHeroi {
    private String nome;
    private String idSecreta;
    private String[] poderes;
    private String[] fraquezas;

    public SuperHeroi() {}

    public SuperHeroi(String nome, String idSecreta, String[] poderes, String[] fraquezas) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.poderes = poderes;
        this.fraquezas = fraquezas;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getIdSecreta() { return idSecreta; }
    public void setIdSecreta(String idSecreta) { this.idSecreta = idSecreta; }

    public String[] getPoderes() { return poderes; }
    public void setPoderes(String[] poderes) { this.poderes = poderes; }

    public String[] getFraquezas() { return fraquezas; }
    public void setFraquezas(String[] fraquezas) { this.fraquezas = fraquezas; }

    public void listarHeroi() {
        String exibe = String.format("Nome: %s \n", nome);
        exibe += String.format("Identidade secreta: %s \n", idSecreta);

        exibe += "Poderes:\n";
        for (String poder : poderes) {
            exibe += String.format("- %s \n", poder);
        }

        exibe += "Fraquezas:\n";
        for (String fraqueza : fraquezas) {
            exibe += String.format("- %s \n", fraqueza);
        }

        JOptionPane.showMessageDialog(null, exibe, "Ficha do Super-Herói", JOptionPane.INFORMATION_MESSAGE);
    }
}