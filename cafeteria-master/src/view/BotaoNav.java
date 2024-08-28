package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoNav extends JButton {

    String nome;

    public BotaoNav(String nome, int x, JPanel panel1, JPanel panel2, JPanel panel3){
        this.nome = nome;
        this.setText(this.nome);
        this.setBounds(x,610, 100, 50);
        this.setBackground(Color.gray);
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fontatual = this.getFont();
        Font novaFonte = fontatual.deriveFont(12f);
        this.setFont(novaFonte);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(BotaoNav.this.nome.equals("Bebida Quente")){
                    panel1.setVisible(true);
                    panel2.setVisible(false);
                    panel3.setVisible(false);
                }if(BotaoNav.this.nome.equals("Bebida Gelada")){
                    panel1.setVisible(false);
                    panel2.setVisible(true);
                    panel3.setVisible(false);
                }if(BotaoNav.this.nome.equals("Lanche")){
                    panel1.setVisible(false);
                    panel2.setVisible(false);
                    panel3.setVisible(true);
                }
            }
        });
    }
}
