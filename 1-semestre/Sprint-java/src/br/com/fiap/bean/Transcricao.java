package br.com.fiap.bean;

import java.time.LocalDate;

public class Transcricao {
    private int id;
    private Reuniao reuniao;
    private String conteudoTexto;
    private String idioma;
    private LocalDate dataProcessamento;

    public Transcricao() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Reuniao getReuniao() { return reuniao; }
    public void setReuniao(Reuniao reuniao) { this.reuniao = reuniao; }
    public String getConteudoTexto() { return conteudoTexto; }
    public void setConteudoTexto(String conteudoTexto) { this.conteudoTexto = conteudoTexto; }
    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }
    public LocalDate getDataProcessamento() { return dataProcessamento; }
    public void setDataProcessamento(LocalDate dataProcessamento) { this.dataProcessamento = dataProcessamento; }

    public String extrairTrecho(int inicio, int fim) {
        if (inicio >= 0 && fim <= conteudoTexto.length() && inicio < fim) {
            return conteudoTexto.substring(inicio, fim);
        }
        return "Trecho invalido!";
    }
}