package br.com.fiap.Bean;

public class LeituraSensor implements Analisavel {
    private String tipoSensor;
    private double valorMedido;
    private String unidadeMedida;
    private String localizacao;

    public LeituraSensor() {}

    public LeituraSensor(String tipoSensor, double valorMedido, String unidadeMedida, String localizacao) {
        this.tipoSensor = tipoSensor;
        this.valorMedido = valorMedido;
        this.unidadeMedida = unidadeMedida;
        this.localizacao = localizacao;
    }

    public String getTipoSensor() { return tipoSensor; }
    public void setTipoSensor(String tipoSensor) { this.tipoSensor = tipoSensor; }
    public double getValorMedido() { return valorMedido; }
    public void setValorMedido(double valorMedido) { this.valorMedido = valorMedido; }
    public String getUnidadeMedida() { return unidadeMedida; }
    public void setUnidadeMedida(String unidadeMedida) { this.unidadeMedida = unidadeMedida; }
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    @Override
    public String analisar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Análise do Sensor ").append(tipoSensor).append(":\n");
        sb.append("Valor: ").append(valorMedido).append(" ").append(unidadeMedida).append("\n");
        sb.append("Localização: ").append(localizacao).append("\n");
        if (valorMedido > 100) sb.append("Alerta: valor acima do limite!\n");
        else sb.append("Valor dentro do normal.\n");
        return sb.toString();
    }

    public void calibrar() {
        System.out.println("Calibrando sensor " + tipoSensor + " na localização " + localizacao);
        valorMedido = 0;
        System.out.println("Sensor calibrado!");
    }

    public void gerarRelatorioLeitura() {
        System.out.println("=== RELATÓRIO DE LEITURA ===");
        System.out.println("Tipo: " + tipoSensor);
        System.out.println("Valor: " + valorMedido + " " + unidadeMedida);
        System.out.println("Localização: " + localizacao);
    }
}