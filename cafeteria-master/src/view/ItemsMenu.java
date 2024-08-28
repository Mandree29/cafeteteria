package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemsMenu extends JButton {

    String nome;
    Double preco;

    public ItemsMenu(String nome, int x, int y, JTable tabela, double preco, JLabel subtotalLabel) {
        this.nome = nome;
        this.preco = preco;
        this.setText(this.nome);
        this.setBounds(x, y, 128, 50);
        this.setBackground(Color.GRAY);
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual = this.getFont();
        Font novaFonte = fonteAtual.deriveFont(16f);
        this.setFont(novaFonte);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Adiciona uma nova linha na tabela
                DefaultTableModel model = (DefaultTableModel) tabela.getModel();
                model.addRow(new Object[]{ItemsMenu.this.nome, ItemsMenu.this.preco});

                // Calcula a soma dos valores na tabela
                double soma = ItemsMenu.somarValores(model);
                System.out.println("Soma total: " + soma);

                // Atualiza o valor da label do subtotal
                subtotalLabel.setText("Subtotal: " + String.format("%.2f", soma)); // Formata para duas casas decimais
            }
        });
    }

    // Método para calcular a soma dos valores na tabela
    public static double somarValores(DefaultTableModel model) {
        double soma = 0.0;
        for (int i = 0; i < model.getRowCount(); i++) {
            Object valor = model.getValueAt(i, 1);
            if (valor instanceof Number) {
                soma += ((Number) valor).doubleValue();
            }
        }
        return soma;
    }
}






