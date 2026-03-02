package br.com.fiap;

public class usaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ar1 = new ArCondicionado();
        ar1.temperatura = 19;
        ar1.modo = "resfriar";
        ar1.aumentarTemperatura();
        ar1.trocarModo("Aquecer");
        System.out.println("Temperatura: "+ ar1.temperatura + "\nModo: " + ar1.modo);
    }
}
