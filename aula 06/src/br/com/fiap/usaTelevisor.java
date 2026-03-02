package br.com.fiap;

public class usaTelevisor {
    public static void main(String[] args) {
        Televisor televisor1 = new Televisor();
        televisor1.canal = 105;
        televisor1.volume = 10;

        televisor1.aumentarVolume();
        televisor1.trocarCanal(50);
        System.out.println("Canal: " + televisor1.canal + "\nVolume: " + televisor1.volume);
    }
}
