package br.com.fiap.Bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RelatorioMonitoramento {
    private String titulo;
    private LocalDateTime dataGeracao;
    private int totalAlertas;
    private int alertasResolvidos;
    private List<Alerta> alertas;

    public RelatorioMonitoramento(String titulo) {
        this.titulo = titulo;
        this.dataGeracao = LocalDateTime.now();
        this.totalAlertas = 0;
        this.alertasResolvidos = 0;
        this.alertas = new ArrayList<>();
    }

    public void adicionarAlerta(Alerta alerta) {
        alertas.add(alerta);
        totalAlertas++;
        if (alerta.isResolvido()) alertasResolvidos++;
    }

    public double calcularEficiencia() {
        if (totalAlertas == 0) return 0;
        return (double) alertasResolvidos / totalAlertas * 100;
    }

    public String gerarResumo() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RESUMO DO RELATÓRIO ===\n");
        sb.append("Título: ").append(titulo).append("\n");
        sb.append("Data de geração: ").append(dataGeracao).append("\n");
        sb.append("Total de alertas: ").append(totalAlertas).append("\n");
        sb.append("Alertas resolvidos: ").append(alertasResolvidos).append("\n");
        sb.append(String.format("Eficiência: %.2f%%\n", calcularEficiencia()));
        return sb.toString();
    }

    public String gerarResumo(boolean detalhado) {
        StringBuilder sb = new StringBuilder(gerarResumo());
        if (detalhado) {
            sb.append("\n--- Detalhamento dos Alertas ---\n");
            for (Alerta a : alertas) {
                sb.append(a.getMensagem()).append(" - ").append(a.getNivelUrgencia()).append("\n");
            }
        }
        return sb.toString();
    }
}