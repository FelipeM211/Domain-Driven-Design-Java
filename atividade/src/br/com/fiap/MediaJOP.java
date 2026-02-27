package br.com.fiap;

import javax.swing.*;
import java.util.Scanner;

public class MediaJOP {
    public static void main(String[] args) {
        float p1, p2, p3, p4, media;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite 1ª nota");
            p1 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite 2ª nota");
            p2 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite 3ª nota");
            p3 = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite 4ª nota");
            p4 = Float.parseFloat(auxiliar);
            media = (p1+p2+p3+p4)/4;
            JOptionPane.showMessageDialog(null, "Media: " + media);
        } catch (Exception e) {
            System.out.println("formato de numero incorreto");
        }
    }
}
