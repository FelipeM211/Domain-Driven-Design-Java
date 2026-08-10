package br.com.fiap.main;

import java.util.Arrays;

public class Carros {
    static void main(String[] args) {
        String[] carros;
        carros = new String[4];

        carros[0] = "Volvo";
        carros[1] = "Mazda";
        carros[2] = "BMW";
        carros[3] = "Fiat";

        System.out.println(carros.length);
        System.out.println(Arrays.toString(carros));
        System.out.println(carros[1]);

        //For para mostrar a lista de carros um em baixo do outro
        for (int i=0; i<carros.length; i++){
            System.out.println(carros[i]);
        }

        //For mais simplificado para vetore
        for (String i: carros){
            System.out.println(i);
        }
    }
}