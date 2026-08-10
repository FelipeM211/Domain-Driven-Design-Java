package br.com.fiap;

import java.util.Scanner;

public class CirculoScanner {
    public static void main(String[] args) {
        double raio, area;
        final double PI = 3.1415;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o valor do raio de um círculo");
            raio = scan.nextDouble();
            area = PI * (raio * raio);
            System.out.println("Área do Círculo: " + area);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}
