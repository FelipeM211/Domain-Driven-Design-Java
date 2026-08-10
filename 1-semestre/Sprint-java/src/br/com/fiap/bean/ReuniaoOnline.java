package br.com.fiap.bean;

public class ReuniaoOnline extends Reuniao {
    private String linkVideo;
    private String plataforma;

    public ReuniaoOnline() {}

    public String getLinkVideo() { return linkVideo; }
    public void setLinkVideo(String linkVideo) { this.linkVideo = linkVideo; }
    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public String gerarLinkAcesso() {
        return "Plataforma: " + plataforma + " | Link: " + linkVideo;
    }
}