package br.com.fiap;

import java.util.Scanner;

public class FolhaDePagamentoScanner {
    public static void main(String[] args) {
        Scanner scan;
        double bruto,inss,plano,salarioinss, saude,liquido;
        int dependentes = 1;
        try {
            scan = new Scanner(System.in);
            System.out.println("Qual é o seu salario bruto? \n -->");
            bruto = scan.nextDouble();
            System.out.println("Numero de dependentes: \n-->");
            dependentes += scan.nextInt();
            System.out.println("Valor do seu desconto do INSS: \n-->");
            inss = scan.nextDouble();
            System.out.println("Valor do seu Plano de Saude: \n-->");
            plano = scan.nextDouble();

            salarioinss = bruto * inss;
            saude = dependentes * plano;
            liquido = bruto - (salarioinss +saude);
            System.out.printf("O salario liquido é: %.2f %nO salário Bruto é %.2f %nO desconto do inss é: %.2f %nO valor do Plano de Saude é de: %.2f %nO numero de dependentes é: %d ", liquido, bruto, inss, plano, dependentes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
