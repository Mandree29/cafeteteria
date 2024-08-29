package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class painel_lateral extends JPanel {

    public painel_lateral(){
        this.setBounds(884,0,300,700);
        this.setBackground(Color.black);
        this.setLayout(null);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                painel_lateral.this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                painel_lateral.this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });
    }
}
