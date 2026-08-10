package br.com.fiap.main;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import br.com.fiap.bean.Cliente;
import br.com.fiap.bean.Insight;
import br.com.fiap.bean.PesquisaSatisfacao;
import br.com.fiap.bean.Reuniao;
import br.com.fiap.bean.ReuniaoOnline;
import br.com.fiap.bean.Transcricao;

public class Main {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        int opcao;

        while (escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog(
                        "=== INSIGHTMEET ===\n" +
                                "Selecione uma opcao:\n" +
                                "(1) Cadastrar Cliente\n" +
                                "(2) Agendar Reuniao\n" +
                                "(3) Agendar Reuniao Online (heranca)\n" +
                                "(4) Importar Transcricao\n" +
                                "(5) Gerar Insight\n" +
                                "(6) Pesquisa de Satisfacao\n" +
                                "(7) Sair");
                opcao = Integer.parseInt(auxiliar);

                switch (opcao) {
                    case 1:
                        String nome = JOptionPane.showInputDialog("Nome do cliente:");
                        String email = JOptionPane.showInputDialog("Email:");
                        String telefone = JOptionPane.showInputDialog("Telefone:");
                        String empresa = JOptionPane.showInputDialog("Empresa:");

                        Cliente cliente = new Cliente();
                        cliente.setId(1);
                        cliente.setNome(nome);
                        cliente.setEmail(email);
                        cliente.setTelefone(telefone);
                        cliente.setEmpresa(empresa);

                        JOptionPane.showMessageDialog(null,
                                "Cliente cadastrado:\n" +
                                        "Nome: " + cliente.getNome() + "\n" +
                                        "Email: " + cliente.getEmail() + "\n" +
                                        "Empresa: " + cliente.getEmpresa());
                        break;

                    case 2:
                        String titulo = JOptionPane.showInputDialog("Titulo da reuniao:");
                        String dataStr = JOptionPane.showInputDialog("Data (AAAA-MM-DD):");
                        String horario = JOptionPane.showInputDialog("Horario inicio (HH:MM):");
                        int duracao = Integer.parseInt(JOptionPane.showInputDialog("Duracao (minutos):"));
                        String linkTransc = JOptionPane.showInputDialog("Link da transcricao:");

                        Reuniao reuniao = new Reuniao();
                        reuniao.setId(1);
                        reuniao.setTitulo(titulo);
                        reuniao.setData(LocalDate.parse(dataStr));
                        reuniao.setHorarioInicio(horario);
                        reuniao.setDuracaoMinutos(duracao);
                        reuniao.setLinkTranscricao(linkTransc);
                        reuniao.setStatus("Agendada");

                        JOptionPane.showMessageDialog(null,
                                "Reuniao agendada!\n" +
                                        "Titulo: " + reuniao.getTitulo() + "\n" +
                                        "Data: " + reuniao.getData() + "\n" +
                                        "Inicio: " + reuniao.getHorarioInicio() + "\n" +
                                        "Termino: " + reuniao.calcularHoraTermino() + "\n" +
                                        "Link transcricao: " + reuniao.getLinkTranscricao() + "\n" +
                                        "Status: " + reuniao.getStatus());
                        break;

                    case 3:
                        String tituloOnline = JOptionPane.showInputDialog("Titulo da reuniao online:");
                        String dataOnline = JOptionPane.showInputDialog("Data (AAAA-MM-DD):");
                        String horarioOnline = JOptionPane.showInputDialog("Horario inicio (HH:MM):");
                        int duracaoOnline = Integer.parseInt(JOptionPane.showInputDialog("Duracao (minutos):"));
                        String linkVideo = JOptionPane.showInputDialog("Link do video:");
                        String plataforma = JOptionPane.showInputDialog("Plataforma (Zoom/Teams/Meet):");

                        ReuniaoOnline reuniaoOnline = new ReuniaoOnline();
                        reuniaoOnline.setId(2);
                        reuniaoOnline.setTitulo(tituloOnline);
                        reuniaoOnline.setData(LocalDate.parse(dataOnline));
                        reuniaoOnline.setHorarioInicio(horarioOnline);
                        reuniaoOnline.setDuracaoMinutos(duracaoOnline);
                        reuniaoOnline.setLinkVideo(linkVideo);
                        reuniaoOnline.setPlataforma(plataforma);
                        reuniaoOnline.setLinkTranscricao("");
                        reuniaoOnline.setStatus("Agendada");

                        JOptionPane.showMessageDialog(null,
                                "Reuniao Online agendada!\n" +
                                        "Titulo: " + reuniaoOnline.getTitulo() + "\n" +
                                        "Data: " + reuniaoOnline.getData() + "\n" +
                                        "Inicio: " + reuniaoOnline.getHorarioInicio() + "\n" +
                                        "Termino: " + reuniaoOnline.calcularHoraTermino() + "\n" +
                                        "Acesso: " + reuniaoOnline.gerarLinkAcesso() + "\n" +
                                        "Status: " + reuniaoOnline.getStatus());
                        break;

                    case 4:
                        int idReuniao = Integer.parseInt(JOptionPane.showInputDialog("ID da reuniao:"));
                        String texto = JOptionPane.showInputDialog("Conteudo da transcricao:");
                        String idioma = JOptionPane.showInputDialog("Idioma:");

                        Reuniao r = new Reuniao();
                        r.setId(idReuniao);

                        Transcricao transcricao = new Transcricao();
                        transcricao.setId(1);
                        transcricao.setReuniao(r);
                        transcricao.setConteudoTexto(texto);
                        transcricao.setIdioma(idioma);
                        transcricao.setDataProcessamento(LocalDate.now());

                        int ini = Integer.parseInt(JOptionPane.showInputDialog("Extrair trecho - posicao inicial:"));
                        int fim = Integer.parseInt(JOptionPane.showInputDialog("Extrair trecho - posicao final:"));

                        JOptionPane.showMessageDialog(null,
                                "Transcricao registrada!\n" +
                                        "Idioma: " + transcricao.getIdioma() + "\n" +
                                        "Data: " + transcricao.getDataProcessamento() + "\n" +
                                        "Trecho: " + transcricao.extrairTrecho(ini, fim));
                        break;

                    case 5:
                        String tipo = JOptionPane.showInputDialog("Tipo (churn/upsell/sentimento/orcamento):");
                        String descricao = JOptionPane.showInputDialog("Descricao do insight:");
                        String sentimento = JOptionPane.showInputDialog("Sentimento (positivo/negativo/misto):");
                        String severidade = JOptionPane.showInputDialog("Severidade (baixa/media/alta):");
                        String evidencia = JOptionPane.showInputDialog("Trecho de evidencia:");

                        Insight insight = new Insight();
                        insight.setId(1);
                        insight.setTipo(tipo);
                        insight.setDescricao(descricao);
                        insight.setSentimento(sentimento);
                        insight.setSeveridade(severidade);
                        insight.setTrechoEvidencia(evidencia);
                        insight.setDataGeracao(LocalDate.now());

                        insight.gerarAlerta();

                        JOptionPane.showMessageDialog(null,
                                "Insight gerado!\n" + insight.gerarResumo() +
                                        "\nData: " + insight.getDataGeracao());
                        break;

                    case 6:
                        String nomeCli = JOptionPane.showInputDialog("Nome do cliente:");
                        String emailCli = JOptionPane.showInputDialog("Email do cliente:");
                        String empresaCli = JOptionPane.showInputDialog("Empresa:");
                        int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota NPS (0 a 10):"));
                        String coment = JOptionPane.showInputDialog("Comentario:");

                        Cliente c = new Cliente();
                        c.setNome(nomeCli);
                        c.setEmail(emailCli);
                        c.setEmpresa(empresaCli);

                        PesquisaSatisfacao ps = new PesquisaSatisfacao();
                        ps.setId(1);
                        ps.setCliente(c);
                        ps.setDataUltimaPesquisa(LocalDate.now());
                        ps.setNotaNPS(nota);
                        ps.setComentario(coment);
                        ps.setRespondida(true);

                        JOptionPane.showMessageDialog(null,
                                "Resultado:\n\n" + ps.exibirResultado() +
                                        "\n\nMedia: " + ps.calcularMediaNotas());
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "Encerrando programa...");
                        escolha = "nao";
                        break;

                    default:
                        throw new Exception("Opcao incorreta!");
                }

                if (opcao != 7) {
                    escolha = JOptionPane.showInputDialog("Deseja continuar? (sim/nao)");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de programa. Volte sempre!");
    }
}