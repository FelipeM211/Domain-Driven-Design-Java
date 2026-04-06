package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Pessoa p1;
        String aux, nome, dataNasc;
        LocalDate minhaData;

        try {
            aux = JOptionPane.showInputDialog("Digite seu nome");
            nome = aux.toUpperCase(); //deixando nome todo em maiusculo

            aux = JOptionPane.showInputDialog("Digite data de nascimento");
            //arrumando a String no formato ano-mes-dia
            dataNasc = aux.substring(6,10);
            dataNasc += "-" + aux.substring(3,5);
            dataNasc += "-" + aux.substring(0,2);

            minhaData = LocalDate.parse(dataNasc);
            p1 = new Pessoa(nome, minhaData);

            JOptionPane.showMessageDialog(null, String.format(
                    "Data formato EUA\nData de nascimento: %s ",
                    p1.getDataNascimento()
            ));

            //formatando a data no padrao dia-mes-ano
            DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataFormatada = p1.getDataNascimento().format(dft);

            JOptionPane.showMessageDialog(null, String.format(
                    "Dados pessoais\nNome: %s \nData de nascimento: %s \nIdade: %d ano(s)",
                    p1.getNome(),
                    dataFormatada,
                    p1.calcularIdade()
            ));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}