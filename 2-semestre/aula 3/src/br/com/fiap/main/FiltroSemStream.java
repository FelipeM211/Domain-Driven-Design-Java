package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Arrays;

public class FiltroSemStream {
    static void main() {
        ArrayList<String> herois = new ArrayList<>(
            Arrays.asList("Homem Aranha", "Wolverine",  "Hulk", "Capitão America", "Homem Elastico", "Pantera Negra", "Viuva Negra", "Mulher Maravilha", "Homem de Ferro", "Miss Marvel", "Mulher Invisiel", "Ciclope")
        );

        ArrayList<String> heroisComH = new ArrayList<>();
        for (String heroi : herois) {
            if (heroi.startsWith("H")) {
                heroisComH.add(heroi);
            }
        }

        System.out.println(heroisComH);
    }
}
