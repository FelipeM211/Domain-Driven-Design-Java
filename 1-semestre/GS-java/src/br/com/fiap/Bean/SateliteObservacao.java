package br.com.fiap.Bean;

public class SateliteObservacao extends Satelite {
    private double resolucao;
    private double areaObservada;
    private int imagensCapturadas;

    public SateliteObservacao() {}

    public SateliteObservacao(String nome, String orbita, boolean ativo, int anoLancamento,
                              double resolucao, double areaObservada, int imagensCapturadas) {
        super(nome, orbita, ativo, anoLancamento);
        this.resolucao = resolucao;
        this.areaObservada = areaObservada;
        this.imagensCapturadas = imagensCapturadas;
    }

    public double getResolucao() { return resolucao; }
    public void setResolucao(double resolucao) { this.resolucao = resolucao; }
    public double getAreaObservada() { return areaObservada; }
    public void setAreaObservada(double areaObservada) { this.areaObservada = areaObservada; }
    public int getImagensCapturadas() { return imagensCapturadas; }
    public void setImagensCapturadas(int imagensCapturadas) { this.imagensCapturadas = imagensCapturadas; }

    @Override
    public void coletarDados() {
        System.out.println("=== COLETA DE DADOS DE OBSERVAÇÃO ===");
        System.out.println("Resolução: " + resolucao + " m/pixel");
        System.out.println("Área observada: " + areaObservada + " km²");
        System.out.println("Imagens capturadas: " + imagensCapturadas);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("--- Dados de Observação ---");
        System.out.println("Resolução: " + resolucao + " m/pixel");
        System.out.println("Área observada: " + areaObservada + " km²");
        System.out.println("Imagens capturadas: " + imagensCapturadas);
    }

    public void capturarImagem() {
        System.out.println("Capturando imagem de toda a área...");
        imagensCapturadas++;
        System.out.println("Imagem capturada! Total: " + imagensCapturadas);
    }

    public void capturarImagem(String regiao) {
        System.out.println("Capturando imagem da região: " + regiao);
        imagensCapturadas++;
        System.out.println("Imagem capturada! Total: " + imagensCapturadas);
    }
}