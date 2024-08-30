package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BotoesCaixa extends JButton {

    String nome;
    int x;
    final int TAMANHO_LINHA = 40; // Define o comprimento fixo de cada linha

    public BotoesCaixa(String nome, int x, JTable jtable, JLabel jLabel, JFrame frame) {
        this.nome = nome;
        this.x = x;
        this.setText(this.nome);
        this.setBounds(x, 24, 100, 50);
        this.setBackground(Color.decode("#AFAEAE"));
        this.setForeground(Color.darkGray);
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual = this.getFont();
        Font novaFonte = fonteAtual.deriveFont(16f);
        this.setFont(novaFonte);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (BotoesCaixa.this.nome.equals("Refazer")) {
                    DefaultTableModel model = (DefaultTableModel) jtable.getModel();
                    model.setRowCount(0); // Limpa todas as linhas da tabela
                    jLabel.setText("Subtotal = 0.0"); // Zera o subtotal
                }
                if (BotoesCaixa.this.nome.equals("Fechar")) {
                    // Cria o ArrayList para armazenar os valores da tabela
                    ArrayList<Object[]> listaValores = new ArrayList<>();

                    // Itera sobre as linhas da tabela
                    DefaultTableModel model = (DefaultTableModel) jtable.getModel();
                    for (int i = 0; i < model.getRowCount(); i++) {
                        // Cria um array para armazenar os valores de uma linha
                        Object[] linha = new Object[2]; // 2 posições

                        // Pega os valores das duas primeiras colunas (ou outras colunas se necessário)
                        linha[0] = model.getValueAt(i, 0); // Primeira coluna (descrição)
                        linha[1] = model.getValueAt(i, 1); // Segunda coluna (valor)

                        // Adiciona a linha à lista
                        listaValores.add(linha);
                    }

                    // Calcula o total dos valores na segunda coluna
                    double total = 0.0;
                    for (Object[] linha : listaValores) {
                        total += Double.parseDouble(linha[1].toString());
                    }

                    // Cria uma string para exibir todos os valores da lista
                    StringBuilder texto = new StringBuilder("<html>");
                    for (Object[] linha : listaValores) {
                        String descricao = linha[0].toString();
                        String valor = linha[1].toString();

                        // Calcula o número de pontos a serem adicionados
                        int numPontinhos = TAMANHO_LINHA - descricao.length() - valor.length();
                        if (numPontinhos < 0) numPontinhos = 0;

                        // Adiciona os pontinhos entre a descrição e o valor
                        texto.append(descricao);
                        for (int i = 0; i < numPontinhos; i++) {
                            texto.append(".");
                        }
                        texto.append(valor).append("<br>");
                    }

                    // Adiciona a linha final com o total calculado
                    String totalStr = String.format("%.2f", total);
                    int numPontinhosTotal = TAMANHO_LINHA - "Total".length() - totalStr.length();
                    if (numPontinhosTotal < 0) numPontinhosTotal = 0;

                    texto.append("Total");
                    for (int i = 0; i < numPontinhosTotal; i++) {
                        texto.append(".");
                    }
                    texto.append(totalStr).append("<br>");

                    texto.append("</html>"); // Fechando a tag HTML

                    // Exibe o JDialog
                    JDialog janela_fecha_conta = new JDialog((JFrame) SwingUtilities.getWindowAncestor(BotoesCaixa.this));
                    janela_fecha_conta.setLayout(new BorderLayout()); // Usando BorderLayout
                    janela_fecha_conta.setLocationRelativeTo((JFrame) SwingUtilities.getWindowAncestor(BotoesCaixa.this));
                    janela_fecha_conta.setTitle("Nota Fiscal");

                    // Adiciona o JLabel com o texto formatado
                    JLabel conta = new JLabel(texto.toString());
                    janela_fecha_conta.add(conta, BorderLayout.CENTER); // Adiciona ao centro

                    // Cria e adiciona o botão "PAGO" na parte inferior
                    JButton pago = new JButton("PAGO");
                    pago.setBackground(Color.green);
                    janela_fecha_conta.add(pago, BorderLayout.SOUTH); // Adiciona na parte inferior

                    janela_fecha_conta.pack();
                    janela_fecha_conta.setVisible(true);

                    pago.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            DefaultTableModel model1 = (DefaultTableModel) jtable.getModel();
                            model.setRowCount(0); // Limpa todas as linhas da tabela
                            jLabel.setText("Subtotal = 0.0"); // Zera o subtotal
                            janela_fecha_conta.dispose();
                        }
                    });
                }
            }
        });
    }
}

