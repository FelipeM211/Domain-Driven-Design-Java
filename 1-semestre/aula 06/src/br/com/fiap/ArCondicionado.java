package br.com.fiap;

public class ArCondicionado {
    public int temperatura;
    public String modo;
    //métodos
    public void aumentarTemperatura(){
        temperatura++;
    }
    public void diminuirTemperatura(){
        temperatura--;
    }
    public void trocarModo(String novoModo){
        modo = novoModo;
    }
}
