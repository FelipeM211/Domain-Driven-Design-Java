package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroComStream {
    static void main() {
        ArrayList<String> herois = new ArrayList<>(
                Arrays.asList("Homem Aranha", "Wolverine",  "Hulk", "Capitão America", "Homem Elastico", "Pantera Negra", "Viuva Negra", "Mulher Maravilha", "Homem de Ferro", "Miss Marvel", "Mulher Invisiel", "Ciclope")
        );

        List<String> heroisComH = herois.stream()
                .filter(heroi -> heroi.startsWith("H"))
                .collect(Collectors.toList());

        System.out.println(heroisComH);

    }
}
