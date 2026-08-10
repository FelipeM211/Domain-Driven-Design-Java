package br.com.fiap.bean;

import java.time.LocalDate;

public class Reuniao {
    private int id;
    private String titulo;
    private LocalDate data;
    private String horarioInicio;
    private int duracaoMinutos;
    private String linkTranscricao;
    private String status;

    public Reuniao() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
    public String getHorarioInicio() { return horarioInicio; }
    public void setHorarioInicio(String horarioInicio) { this.horarioInicio = horarioInicio; }
    public int getDuracaoMinutos() { return duracaoMinutos; }
    public void setDuracaoMinutos(int duracaoMinutos) { this.duracaoMinutos = duracaoMinutos; }
    public String getLinkTranscricao() { return linkTranscricao; }
    public void setLinkTranscricao(String linkTranscricao) { this.linkTranscricao = linkTranscricao; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String calcularHoraTermino() {
        String[] partes = horarioInicio.split(":");
        int hora = Integer.parseInt(partes[0]);
        int minuto = Integer.parseInt(partes[1]) + duracaoMinutos;
        hora += minuto / 60;
        minuto = minuto % 60;
        return String.format("%02d:%02d", hora, minuto);
    }
}