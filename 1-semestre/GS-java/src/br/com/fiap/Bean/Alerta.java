package br.com.fiap.Bean;

import java.time.LocalDateTime;

public class Alerta {
    private String mensagem;
    private String nivelUrgencia;
    private LocalDateTime dataHora;
    private boolean resolvido;

    public Alerta(String mensagem) {
        this.mensagem = mensagem;
        this.nivelUrgencia = "BAIXO";
        this.dataHora = LocalDateTime.now();
        this.resolvido = false;
    }

    public Alerta(String mensagem, String nivelUrgencia) {
        this.mensagem = mensagem;
        this.nivelUrgencia = nivelUrgencia;
        this.dataHora = LocalDateTime.now();
        this.resolvido = false;
    }

    public Alerta(String mensagem, String nivelUrgencia, LocalDateTime dataHora) {
        this.mensagem = mensagem;
        this.nivelUrgencia = nivelUrgencia;
        this.dataHora = dataHora;
        this.resolvido = false;
    }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
    public String getNivelUrgencia() { return nivelUrgencia; }
    public void setNivelUrgencia(String nivelUrgencia) { this.nivelUrgencia = nivelUrgencia; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public boolean isResolvido() { return resolvido; }
    public void setResolvido(boolean resolvido) { this.resolvido = resolvido; }

    public void exibirAlerta() {
        System.out.println("=== ALERTA ===");
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Nível de urgência: " + nivelUrgencia);
        System.out.println("Data/Hora: " + dataHora);
        System.out.println("Resolvido: " + (resolvido ? "Sim" : "Não"));
    }

    public void resolver() {
        this.resolvido = true;
        System.out.println("Alerta resolvido: " + mensagem);
    }
}
