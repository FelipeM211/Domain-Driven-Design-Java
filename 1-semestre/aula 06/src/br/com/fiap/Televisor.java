package br.com.fiap;

public class Televisor {
    public int canal;
    public int volume;
    //métodos
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }
}
