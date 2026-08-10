package br.com.fiap.bean;

import java.time.LocalDate;

public class PesquisaSatisfacao {
    private int id;
    private Cliente cliente;
    private LocalDate dataUltimaPesquisa;
    private int notaNPS;
    private String comentario;
    private boolean respondida;

    public PesquisaSatisfacao() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public LocalDate getDataUltimaPesquisa() { return dataUltimaPesquisa; }
    public void setDataUltimaPesquisa(LocalDate dataUltimaPesquisa) { this.dataUltimaPesquisa = dataUltimaPesquisa; }
    public int getNotaNPS() { return notaNPS; }
    public void setNotaNPS(int notaNPS) { this.notaNPS = notaNPS; }
    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }
    public boolean isRespondida() { return respondida; }
    public void setRespondida(boolean respondida) { this.respondida = respondida; }

    public String classificarNPS() {
        if (notaNPS >= 9) {
            return "Promotor";
        } else if (notaNPS >= 7) {
            return "Neutro";
        } else {
            return "Detrator";
        }
    }

    public double calcularMediaNotas() {
        if (notaNPS >= 9) {
            return 10.0;
        } else if (notaNPS >= 7) {
            return 7.5;
        } else if (notaNPS >= 4) {
            return 5.0;
        } else {
            return 2.0;
        }
    }

    public String exibirResultado() {
        return String.format("Cliente: %s\nNota NPS: %d\nClassificacao: %s\nComentario: %s",
                cliente.getNome(), notaNPS, classificarNPS(), comentario);
    }
}