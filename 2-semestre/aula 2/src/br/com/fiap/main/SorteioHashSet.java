package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;


public class SorteioHashSet {
    static void main(String[] args) {
        HashSet<Integer> numerosSorteados = new HashSet<Integer>();
        Random random = new Random();
        do {
            JOptionPane.showMessageDialog(null, "Confira a seguir o resultado do sorteio da Loteria da Sorte premiada!", "Loteria", JOptionPane.INFORMATION_MESSAGE);
            while (numerosSorteados.size() < 6) {
                int numero = random.nextInt(59) + 1 ;
                numerosSorteados.add(numero);
            }
            ArrayList<Integer> resultadoDoSorteio = new ArrayList<Integer>(numerosSorteados);
            Collections.sort(resultadoDoSorteio);
            JOptionPane.showMessageDialog(null, "Os números sorteados são: \n" + resultadoDoSorteio);
            numerosSorteados.clear();
        }while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim do programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
