package br.com.fiap.Bean;

public abstract class Satelite {
    private String nome;
    private String orbita;
    private boolean ativo;
    private int anoLancamento;

    public Satelite() {}

    public Satelite(String nome, String orbita, boolean ativo, int anoLancamento) {
        this.nome = nome;
        this.orbita = orbita;
        this.ativo = ativo;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getOrbita() { return orbita; }
    public void setOrbita(String orbita) { this.orbita = orbita; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
    public int getAnoLancamento() { return anoLancamento; }
    public void setAnoLancamento(int anoLancamento) { this.anoLancamento = anoLancamento; }

    public void exibirInfo() {
        System.out.println("=== INFORMAÇÕES DO SATÉLITE ===");
        System.out.println("Nome: " + nome);
        System.out.println("Órbita: " + orbita);
        System.out.println("Ativo: " + (ativo ? "Sim" : "Não"));
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public abstract void coletarDados();
}
