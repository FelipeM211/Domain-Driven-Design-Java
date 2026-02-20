package br.com.fiap;

public class Primitivo {
    public static void main(String[] args) {
        //declaração e inicialização de variaveis -> tipo nome = valor;
        char sexo = 'F';
        byte idade = 27;
        short codigo = 15650;
        int alunos = 50;
        int classes = 11;
        //int alunos = 50, int classes = 11; (duas variaveis iguais na mesma linha)
        long brasileiros = 216635748L; // letra 'L' no final indica que o numero é um Long
        float media = 8.7f; // 'f' minusculo indica que o numero é um float
        double dolar = 5.15;
        boolean alternativa = false;
        String nome = "Astrogildo Planetario Celeste";
        System.out.println("Sexo: " + sexo + " Idade: " + idade +" Código: " + codigo);
        System.out.println("Média: " + media +" Alunos: " + alunos +" Turmas: " + classes);
        System.out.println("Habitantes: " + brasileiros + " Cotação do Dolar: " + dolar);
        System.out.println("Alternativa: " + alternativa);
        System.out.println("Nome: " + nome);
    }
}
