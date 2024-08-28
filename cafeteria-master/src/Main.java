import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Cafeteria");
        frame.setSize(1200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);

        ImageIcon icon = new ImageIcon("icone.png");
        Image image1 = icon.getImage(); // Obtendo a imagem do ícone

        // Definindo o ícone no JFrame
        frame.setIconImage(image1);

        // Criar o JPanel para o texto e o ícone
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Criar JLabel para o ícone
        ImageIcon icone = new ImageIcon("icone.png");
        Image image = icone.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icone.setImage(image);
        JLabel iconLabel = new JLabel(icone);
        iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Criar JLabel para o texto
        JLabel t1 = new JLabel("Cafeteria da Ellen");
        Font font = new Font("Arial", Font.BOLD, 24);
        t1.setFont(font);
        t1.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Adicionar o ícone e o texto ao JPanel
        textPanel.add(iconLabel);
        textPanel.add(Box.createVerticalStrut(10));
        textPanel.add(t1);
        textPanel.setBounds(310, 6, 280, 160);

        // adicionando o label data
        JLabel data = new JLabel("" + tempo.dia + "/ " + tempo.obterMesPorNumero(tempo.mes) + " / " + tempo.ano);
//        Font fon3 = new Font("Arial", Font.BOLD, 24);
//        data.setFont(fon3);
        data.setBounds(20,10,200,16);


        //PAINEL PRINCIPAL
        // Criando a divisão do meu painel
        JPanel panel = new JPanel();
        panel.setBounds(884, 0, 300, 700);
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);

        // criando o labe do pedido
        JLabel pedido = new JLabel("Bebidas Quentes");
        Font fon2 = new Font("Arial", Font.BOLD, 24);
        pedido.setFont(fon2);
        pedido.setBounds(58,50,200, 100);
        pedido.setForeground(Color.BLACK);

        // Criando os botões do JPanel
        JButton expresso = new JButton("Expresso");
        expresso.setBounds(20, 160, 128, 50);
        expresso.setBackground(Color.GRAY);
        expresso.setFocusPainted(false);
        expresso.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual = expresso.getFont();
        Font novaFonte = fonteAtual.deriveFont(16f); // Define o tamanho da fonte para 20
        expresso.setFont(novaFonte);

        JButton coado = new JButton("Coado");
        coado.setBounds(158, 160, 128, 50);
        coado.setBackground(Color.GRAY);
        coado.setFocusPainted(false);
        coado.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual1 = coado.getFont();
        Font novaFonte1 = fonteAtual.deriveFont(16f); // Define o tamanho da fonte para 20
        coado.setFont(novaFonte1);

        JButton americano = new JButton("Americano");
        americano.setBounds(20, 240, 128, 50);
        americano.setBackground(Color.GRAY);
        americano.setFocusPainted(false);
        americano.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual2 = americano.getFont();
        Font novaFonte2 = fonteAtual.deriveFont(16f); // Define o tamanho da fonte para 20
        americano.setFont(novaFonte2);

        JButton capocinno = new JButton("Capocinno");
        capocinno.setBounds(158, 240, 128, 50);
        capocinno.setBackground(Color.GRAY);
        capocinno.setFocusPainted(false);
        capocinno.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual3 = capocinno.getFont();
        Font novaFonte3 = fonteAtual.deriveFont(16f); // Define o tamanho da fonte para 20
        capocinno.setFont(novaFonte3);

        JButton latte = new JButton("Latte");
        latte.setBounds(20, 320, 128, 50);
        latte.setBackground(Color.GRAY);
        latte.setFocusPainted(false);
        latte.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual4 = latte.getFont();
        Font novaFonte4 = fonteAtual.deriveFont(16f); // Define o tamanho da fonte para 20
        latte.setFont(novaFonte4);

        JButton mocha = new JButton("Mocha");
        mocha.setBounds(158, 320, 128, 50);
        mocha.setBackground(Color.GRAY);
        mocha.setFocusPainted(false);
        mocha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual5 = mocha.getFont();
        Font novaFonte5 = fonteAtual.deriveFont(16f); // Define o tamanho da fonte para 20
        mocha.setFont(novaFonte5);

        JButton cafe_leite = new JButton("Cafe com Leite");
        cafe_leite.setBounds(20, 400, 128, 50);
        cafe_leite.setBackground(Color.GRAY);
        cafe_leite.setFocusPainted(false);
        cafe_leite.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual6 = cafe_leite.getFont();
        Font novaFonte6 = fonteAtual.deriveFont(12f); // Define o tamanho da fonte para 20
        cafe_leite.setFont(novaFonte6);

        JButton choco_quente = new JButton("Chocolate Quente");
        choco_quente.setBounds(158, 400, 128, 50);
        choco_quente.setBackground(Color.GRAY);
        choco_quente.setFocusPainted(false);
        choco_quente.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual7 = choco_quente.getFont();
        Font novaFonte7 = fonteAtual.deriveFont(10f); // Define o tamanho da fonte para 20
        choco_quente.setFont(novaFonte7);

        JButton Bebidas_Quentes = new JButton("B. quentes");
        Bebidas_Quentes.setBounds(0, 610, 100, 50);
        Bebidas_Quentes.setBackground(Color.GRAY);
        Bebidas_Quentes.setFocusPainted(false);
        Bebidas_Quentes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual8 = Bebidas_Quentes.getFont();
        Font novaFonte8 = fonteAtual.deriveFont(12f); // Define o tamanho da fonte para 20
        Bebidas_Quentes.setFont(novaFonte8);

        JButton Bebidas_Geladas = new JButton("B. geladas");
        Bebidas_Geladas.setBounds(100, 610, 100, 50);
        Bebidas_Geladas.setBackground(Color.GRAY);
        Bebidas_Geladas.setFocusPainted(false);
        Bebidas_Geladas.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual9 = Bebidas_Geladas.getFont();
        Font novaFonte9 = fonteAtual.deriveFont(12f); // Define o tamanho da fonte para 20
        Bebidas_Geladas.setFont(novaFonte9);

        JButton lanche = new JButton("lanche");
        lanche.setBounds(200, 610, 100, 50);
        lanche.setBackground(Color.GRAY);
        lanche.setFocusPainted(false);
        lanche.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual10 = lanche.getFont();
        Font novaFonte10 = fonteAtual.deriveFont(12f); // Define o tamanho da fonte para 20
        lanche.setFont(novaFonte10);

        panel.add(pedido);
        panel.add(expresso);
        panel.add(coado);
        panel.add(americano);
        panel.add(capocinno);
        panel.add(latte);
        panel.add(mocha);
        panel.add(cafe_leite);
        panel.add(choco_quente);
        panel.add(Bebidas_Geladas);
        panel.add(Bebidas_Quentes);
        panel.add(lanche);

        // FIM DO PAINEL PRINCIPAL

        // PAINEL MENU BEBIDAS GELADAS
        JPanel B_geladas = new JPanel();
        B_geladas.setBounds(884, 0, 300, 700);
        B_geladas.setBackground(Color.darkGray);
        B_geladas.setLayout(null);
        B_geladas.setVisible(false);

        // ADICIONANDO OS BUTÕES DE NAVEGAÇÃO BEBIDAS GELADAS

        JButton Bebidas_Quentes2 = new JButton("B. quentes");
        Bebidas_Quentes2.setBounds(0, 610, 100, 50);
        Bebidas_Quentes2.setBackground(Color.GRAY);
        Bebidas_Quentes2.setFocusPainted(false);
        Bebidas_Quentes2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual11 = Bebidas_Quentes2.getFont();
        Font novaFonte11 = fonteAtual.deriveFont(12f); // Define o tamanho da fonte para 20
        Bebidas_Quentes.setFont(novaFonte11);

        JButton Bebidas_Geladas2 = new JButton("B. geladas");
        Bebidas_Geladas2.setBounds(100, 610, 100, 50);
        Bebidas_Geladas2.setBackground(Color.GRAY);
        Bebidas_Geladas2.setFocusPainted(false);
        Bebidas_Geladas2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual12 = Bebidas_Geladas.getFont();
        Font novaFonte12 = fonteAtual.deriveFont(12f); // Define o tamanho da fonte para 20
        Bebidas_Geladas.setFont(novaFonte12);

        JButton lanche2 = new JButton("lanche");
        lanche2.setBounds(200, 610, 100, 50);
        lanche2.setBackground(Color.GRAY);
        lanche.setFocusPainted(false);
        lanche2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonteAtual13 = lanche.getFont();
        Font novaFonte13 = fonteAtual.deriveFont(12f); // Define o tamanho da fonte para 20
        lanche.setFont(novaFonte13);

        B_geladas.add(Bebidas_Quentes2);
        B_geladas.add(Bebidas_Geladas2);
        B_geladas.add(lanche2);
        // fim do painel de bebidas geladas


        // PAINEL MENU LANCHES
        JPanel Lanches_panel = new JPanel();
        Lanches_panel.setBounds(884, 0, 300, 700);
        Lanches_panel.setBackground(Color.blue);
        Lanches_panel.setLayout(null);
        Lanches_panel.setVisible(false);

        JPanel panel2 = new JPanel();
        panel2.setBounds(120, 160, 680, 320);
        panel2.setBackground(Color.GRAY);
        panel2.setLayout(new BorderLayout());

        String[] nomeDasColunas = {"Descricao", "Valor"};
        DefaultTableModel model = new DefaultTableModel(nomeDasColunas, 0);
        JTable tabela = new JTable(model);
        tabela.setFont(new Font("Arial", Font.PLAIN, 18));
        tabela.setRowHeight(30);
        JScrollPane scrollPane = new JScrollPane(tabela);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < tabela.getColumnCount(); i++) {
            tabela.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        panel2.add(scrollPane, BorderLayout.CENTER);

        JPanel panel3 = new JPanel();
        panel3.setBounds(120, 510, 680, 90);
        panel3.setBackground(Color.decode("#2B2B2B"));
        panel3.setLayout(null);

        JLabel st = new JLabel("Subtotal = 0.0");
        Font font2 = new Font("Arial", Font.BOLD, 20);
        st.setFont(font2);
        st.setForeground(Color.WHITE);
        st.setBounds(250, 32, 200, 30);

        JButton refazer = new JButton("REFAZER");
        refazer.setBounds(20, 24, 100, 50);
        refazer.setBackground(Color.decode("#AFAEAE"));
        refazer.setForeground(Color.black);
        refazer.setFocusPainted(false);
        refazer.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JButton fechar = new JButton("FECHAR");
        fechar.setBounds(540, 24, 100, 50);
        fechar.setBackground(Color.decode("#AFAEAE"));
        fechar.setForeground(Color.black);
        fechar.setFocusPainted(false);
        fechar.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        panel3.add(st);
        panel3.add(refazer);
        panel3.add(fechar);

        // Adicionar os componentes ao JFrame
        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(textPanel);
        frame.add(data);
        frame.add(B_geladas);
        frame.add(Lanches_panel);

        // Tornar o JFrame visível
        frame.setVisible(true);

        refazer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setRowCount(0); // Limpa todas as linhas da tabela
                st.setText("Subtotal = 0.0"); // Zera o subtotal
            }
        });

        // ActionListeners para os botões
        expresso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{"Expresso", 5.00});
                atualizarSubtotal(model, st); // Atualiza subtotal
            }
        });

        coado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{"Coado", 7.00});
                atualizarSubtotal(model, st); // Atualiza subtotal
            }
        });

        americano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{"Americano", 7.00});
                atualizarSubtotal(model, st); // Atualiza subtotal
            }
        });

        capocinno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{"Capoccino", 7.50});
                atualizarSubtotal(model, st); // Atualiza subtotal
            }
        });

        latte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{"Latte", 10.00});
                atualizarSubtotal(model, st); // Atualiza subtotal
            }
        });

        mocha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{"Mocha", 12.00});
                atualizarSubtotal(model, st); // Atualiza subtotal
            }
        });

        cafe_leite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{"Cafe com Leite", 5.00});
                atualizarSubtotal(model, st); // Atualiza subtotal
            }
        });

        choco_quente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{"Chocolate quente", 6.00});
                atualizarSubtotal(model, st); // Atualiza subtotal
            }
        });

        // ações dos botões de navegação --- mudança de páginas do menu

        Bebidas_Quentes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(true);
                Lanches_panel.setVisible(false);
                B_geladas.setVisible(false);
            }
        });

        Bebidas_Geladas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                Lanches_panel.setVisible(false);
                B_geladas.setVisible(true);
            }
        });

        lanche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                Lanches_panel.setVisible(true);
                B_geladas.setVisible(false);
            }
        });

        Bebidas_Quentes2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(true);
                Lanches_panel.setVisible(false);
                B_geladas.setVisible(false);
            }
        });

        Bebidas_Geladas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                Lanches_panel.setVisible(false);
                B_geladas.setVisible(true);
            }
        });

        lanche2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                Lanches_panel.setVisible(true);
                B_geladas.setVisible(false);
            }
        });
    }

    public static double somarValores(DefaultTableModel model) {
        double soma = 0.0;

        // Percorre todas as linhas da tabela
        for (int i = 0; i < model.getRowCount(); i++) {
            Object valor = model.getValueAt(i, 1); // Acessa a coluna de valor

            // Verifica se o valor é um Float ou pode ser convertido
            if (valor instanceof Number) {
                soma += ((Number) valor).doubleValue(); // Adiciona à soma
            } else {
                try {
                    // Tenta converter para Double se for uma String
                    soma += Double.parseDouble(valor.toString());
                } catch (NumberFormatException e) {
                    // Se não for um número, ignora
                    System.out.println("Valor não numérico encontrado: " + valor);
                }
            }
        }

        return soma;
    }

    // Método para atualizar o subtotal
    public static void atualizarSubtotal(DefaultTableModel model, JLabel st) {
        double subtotal = somarValores(model);
        st.setText("Subtotal = " + subtotal);
    }


}
