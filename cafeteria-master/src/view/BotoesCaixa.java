package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotoesCaixa extends JButton {

    String nome;
    int x;

    public BotoesCaixa(String nome, int x, JTable jtable, JLabel jLabel){
        this.nome = nome;
        this.x = x;
        this.setText(this.nome);
        this.setBounds(x, 24, 100, 50);
        this.setBackground(Color.decode("#AFAEAE"));
        this.setForeground(Color.BLACK);
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   if(BotoesCaixa.this.nome.equals("Refazer")){
                       DefaultTableModel model = (DefaultTableModel) jtable.getModel();
                       model.setRowCount(0); // Limpa todas as linhas da tabela
                       jLabel.setText("Subtotal = 0.0"); // Zera o subtotal
                   }
                   if(BotoesCaixa.this.nome.equals("fechar")){
                    System.out.println("Botao fechar");
                }
            }
        });


    }

}
