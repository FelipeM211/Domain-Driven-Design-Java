package br.com.fiap.Bean;

public class SateliteClimatico extends Satelite implements Analisavel {
    private double temperatura;
    private double umidade;
    private double pressaoAtmosferica;

    public SateliteClimatico() {}

    public SateliteClimatico(String nome, String orbita, boolean ativo, int anoLancamento,
                             double temperatura, double umidade, double pressaoAtmosferica) {
        super(nome, orbita, ativo, anoLancamento);
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressaoAtmosferica = pressaoAtmosferica;
    }

    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }
    public double getUmidade() { return umidade; }
    public void setUmidade(double umidade) { this.umidade = umidade; }
    public double getPressaoAtmosferica() { return pressaoAtmosferica; }
    public void setPressaoAtmosferica(double pressaoAtmosferica) { this.pressaoAtmosferica = pressaoAtmosferica; }

    @Override
    public void coletarDados() {
        System.out.println("=== COLETA DE DADOS CLIMÁTICOS ===");
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Umidade: " + umidade + "%");
        System.out.println("Pressão atmosférica: " + pressaoAtmosferica + " hPa");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("--- Dados Climáticos ---");
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Umidade: " + umidade + "%");
        System.out.println("Pressão atmosférica: " + pressaoAtmosferica + " hPa");
    }

    @Override
    public String analisar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Análise Climática:\n");
        sb.append("Temperatura: ").append(temperatura).append("°C - ");
        if (temperatura > 40) sb.append("Crítico!\n");
        else if (temperatura > 30) sb.append("Alerta!\n");
        else sb.append("Normal.\n");
        sb.append("Umidade: ").append(umidade).append("% - ");
        if (umidade > 80) sb.append("Alta!\n");
        else if (umidade < 20) sb.append("Baixa!\n");
        else sb.append("Normal.\n");
        sb.append("Pressão: ").append(pressaoAtmosferica).append(" hPa - ");
        if (pressaoAtmosferica < 950 || pressaoAtmosferica > 1050) sb.append("Crítico!\n");
        else sb.append("Normal.\n");
        return sb.toString();
    }

    public String classificarClima() {
        if (temperatura > 35 && umidade > 70) return "Tempestade tropical";
        else if (temperatura > 30 && umidade < 30) return "Seca severa";
        else return "Clima estável";
    }

    public String classificarClima(double temp, double umid, double pressao) {
        if (temp > 35 && umid > 70 && pressao < 970) return "Ciclone";
        else if (temp > 40 && umid < 20) return "Onda de calor extrema";
        else return "Condições normais";
    }

    public double calcularMediaTemperatura(double... temperaturas) {
        double soma = 0;
        for (double t : temperaturas) soma += t;
        return temperaturas.length > 0 ? soma / temperaturas.length : 0;
    }
}