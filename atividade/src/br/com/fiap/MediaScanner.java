package br.com.fiap;

import java.util.Scanner;

public class MediaScanner {
    public static void main(String[] args) {
        float p1, p2, p3, p4, media;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite 4 notas de provas");
            p1 = scan.nextFloat();
            p2 = scan.nextFloat();
            p3 = scan.nextFloat();
            p4 = scan.nextFloat();
            media = (p1+p2+p3+p4)/4;
            System.out.println("Média: " + media);

        } catch (Exception e) {
            System.out.println("formato de numero incorreto");
        }
    }
}
