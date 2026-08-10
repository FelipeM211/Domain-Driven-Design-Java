package br.com.fiap;

public class usaRadio {
    public static void main(String[] args) {
        // declaração e instanciação do objeto
        Radio radio1 = new Radio();
        Radio radio2 = new Radio();
        radio1.estacao = 89.1f;
        radio2.estacao = 100f;
        radio2.volume = 9;
        radio1.volume = 5;
        radio1.trocarEstacao(92.5f);
        radio1.aumentarVolume();
        radio1.aumentarVolume();
        System.out.println("Volume: "+ radio1.volume + " \nEstação: " + radio1.estacao + "Mhz");
        System.out.println("Volume: "+ radio2.volume + " \nEstação: " + radio2.estacao + "Mhz");

    }
}
