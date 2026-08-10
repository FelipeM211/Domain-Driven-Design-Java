package br.com.fiap.bean;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Insight {
    private int id;
    private Transcricao transcricao;
    private String tipo;
    private String descricao;
    private String sentimento;
    private String severidade;
    private String trechoEvidencia;
    private LocalDate dataGeracao;

    public Insight() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Transcricao getTranscricao() { return transcricao; }
    public void setTranscricao(Transcricao transcricao) { this.transcricao = transcricao; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getSentimento() { return sentimento; }
    public void setSentimento(String sentimento) { this.sentimento = sentimento; }
    public String getSeveridade() { return severidade; }
    public void setSeveridade(String severidade) { this.severidade = severidade; }
    public String getTrechoEvidencia() { return trechoEvidencia; }
    public void setTrechoEvidencia(String trechoEvidencia) { this.trechoEvidencia = trechoEvidencia; }
    public LocalDate getDataGeracao() { return dataGeracao; }
    public void setDataGeracao(LocalDate dataGeracao) { this.dataGeracao = dataGeracao; }

    public void gerarAlerta() {
        String alerta;
        if (tipo.equalsIgnoreCase("churn") && severidade.equalsIgnoreCase("alta")) {
            alerta = "ALERTA CRITICO: Risco de churn elevado! Acao imediata necessaria.";
        } else if (tipo.equalsIgnoreCase("upsell")) {
            alerta = "OPORTUNIDADE: Upsell identificado!";
        } else if (sentimento.equalsIgnoreCase("negativo")) {
            alerta = "ATENCAO: Sentimento negativo detectado.";
        } else {
            alerta = "Insight registrado sem alertas criticos.";
        }
        JOptionPane.showMessageDialog(null, alerta);
    }

    public String gerarResumo() {
        return String.format("Tipo: %s | Sentimento: %s | Severidade: %s\nDescricao: %s",
                tipo, sentimento, severidade, descricao);
    }
}