package br.com.fiap.Main;

import br.com.fiap.Bean.*;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;

public class SpaceGuardApp {
    public static void main(String[] args) {
        SateliteClimatico satClimatico = new SateliteClimatico("ClimaSat-1", "Órbita Polar", true, 2020, 28.5, 65.0, 1013.0);
        SateliteObservacao satObs = new SateliteObservacao("ObsSat-1", "Órbita Geoestacionária", true, 2019, 0.5, 1500.0, 120);
        LeituraSensor sensor = new LeituraSensor("Radiação Solar", 85.0, "W/m²", "Zona Equatorial");
        RelatorioMonitoramento relatorio = new RelatorioMonitoramento("Relatório SpaceGuard - Missão 1");

        char opcao;
        do {
            String input = JOptionPane.showInputDialog(null,
                    "===== SPACEGUARD - MENU PRINCIPAL =====\n" +
                            "a) Coletar dados\n" +
                            "b) Analisar dados\n" +
                            "c) Gerar alerta\n" +
                            "d) Exibir informações\n" +
                            "e) Capturar imagem\n" +
                            "f) Calcular média de temperatura\n" +
                            "g) Classificar clima\n" +
                            "h) Exibir relatório\n" +
                            "i) Sair\n" +
                            "\nEscolha uma opção:",
                    "SpaceGuard", JOptionPane.QUESTION_MESSAGE);
            if (input == null || input.isEmpty()) {
                opcao = 'i';
            } else {
                opcao = input.toLowerCase().charAt(0);
            }

            switch (opcao) {
                case 'a':
                    satClimatico.coletarDados();
                    satObs.coletarDados();
                    sensor.gerarRelatorioLeitura();
                    JOptionPane.showMessageDialog(null, "Dados coletados! Verifique o console.", "Coleta", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 'b':
                    String analise = satClimatico.analisar();
                    JOptionPane.showMessageDialog(null, analise, "Análise Climática", JOptionPane.INFORMATION_MESSAGE);
                    if (analise.contains("Crítico") || analise.contains("Alerta")) {
                        Alerta alerta = new Alerta("Análise climática detectou condição crítica!", "ALTO");
                        relatorio.adicionarAlerta(alerta);
                        JOptionPane.showMessageDialog(null, "Alerta gerado automaticamente!", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 'c':
                    String msg = JOptionPane.showInputDialog(null, "Digite a mensagem do alerta:", "Novo Alerta", JOptionPane.QUESTION_MESSAGE);
                    String nivel = JOptionPane.showInputDialog(null, "Digite o nível de urgência (BAIXO, MÉDIO, ALTO, CRÍTICO):", "Nível", JOptionPane.QUESTION_MESSAGE);
                    if (msg != null && !msg.isEmpty() && nivel != null && !nivel.isEmpty()) {
                        Alerta alerta = new Alerta(msg, nivel.toUpperCase());
                        relatorio.adicionarAlerta(alerta);
                        JOptionPane.showMessageDialog(null, "Alerta adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Campos inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 'd':
                    satClimatico.exibirInfo();
                    satObs.exibirInfo();
                    sensor.gerarRelatorioLeitura();
                    JOptionPane.showMessageDialog(null, "Informações exibidas no console.", "Info", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 'e':
                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja capturar imagem de uma região específica?", "Capturar Imagem", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        String regiao = JOptionPane.showInputDialog(null, "Digite a região:", "Região", JOptionPane.QUESTION_MESSAGE);
                        if (regiao != null && !regiao.isEmpty()) {
                            satObs.capturarImagem(regiao);
                        }
                    } else {
                        satObs.capturarImagem();
                    }
                    JOptionPane.showMessageDialog(null, "Total de imagens capturadas: " + satObs.getImagensCapturadas(), "Imagens", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 'f':
                    String tempInput = JOptionPane.showInputDialog(null, "Digite as temperaturas separadas por vírgula (ex: 25,30,28):", "Média Temperatura", JOptionPane.QUESTION_MESSAGE);
                    if (tempInput != null && !tempInput.isEmpty()) {
                        String[] partes = tempInput.split(",");
                        double[] temps = new double[partes.length];
                        for (int i = 0; i < partes.length; i++) {
                            temps[i] = Double.parseDouble(partes[i].trim());
                        }
                        double media = satClimatico.calcularMediaTemperatura(temps);
                        JOptionPane.showMessageDialog(null, String.format("Média das temperaturas: %.2f°C", media), "Média", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 'g':
                    String classSemParam = satClimatico.classificarClima();
                    String classComParam = satClimatico.classificarClima(35, 80, 960);
                    JOptionPane.showMessageDialog(null, "Classificação sem parâmetros: " + classSemParam + "\nClassificação com parâmetros: " + classComParam, "Classificação Climática", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 'h':
                    int detalhe = JOptionPane.showConfirmDialog(null, "Deseja exibir o relatório detalhado?", "Relatório", JOptionPane.YES_NO_OPTION);
                    String relatorioStr = (detalhe == JOptionPane.YES_OPTION) ? relatorio.gerarResumo(true) : relatorio.gerarResumo();
                    JOptionPane.showMessageDialog(null, relatorioStr, "Relatório", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 'i':
                    JOptionPane.showMessageDialog(null, "Encerrando SpaceGuard...", "Sair", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcao != 'i');
    }
}