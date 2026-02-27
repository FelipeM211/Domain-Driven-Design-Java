package br.com.fiap;

import javax.swing.*;
import java.util.Scanner;

public class IdadeScanner {
    public static void main(String[] args) {
        int anoAtual, anoDeNascimento, idade;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite o ano atual: ");
            anoAtual = scan.nextInt();
            System.out.println("Digite o ano de nascimento: ");
            anoDeNascimento = scan.nextInt();
            idade = anoAtual-anoDeNascimento;
            System.out.println("Idade: " + idade);
        }catch (Exception e) {
            System.out.println("formato de numero incorreto");
        }
    }
}
