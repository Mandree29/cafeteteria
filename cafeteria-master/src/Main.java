import view.BotaoNav;
import view.ItemsMenu;
import view.painel_lateral;

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
        data.setBounds(20,10,200,16);

        // criando o labe do pedido
        JLabel pedido = new JLabel("Bebidas Quentes");
        Font fon2 = new Font("Arial", Font.BOLD, 24);
        pedido.setFont(fon2);
        pedido.setBounds(58,50,200, 100);
        pedido.setForeground(Color.BLACK);

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

        panel2.add(scrollPane, BorderLayout.CENTER);

        painel_lateral painel1 = new painel_lateral();
        painel_lateral painel2 = new painel_lateral();
        painel_lateral painel3 = new painel_lateral();
        ItemsMenu expresso = new ItemsMenu("Expresso", 20,160, tabela, 5.00, st);
        ItemsMenu coado = new ItemsMenu("Coado", 158, 160,tabela,6.50, st);
        ItemsMenu americano = new ItemsMenu("Americano",20, 240, tabela, 4.70, st);
        ItemsMenu capocinno = new ItemsMenu("Capoccino", 158, 240, tabela, 8.00, st);
        ItemsMenu latte = new ItemsMenu("Latte", 20, 320, tabela, 8.80, st);
        ItemsMenu mocha = new ItemsMenu("mocha", 158, 320, tabela, 9.90, st);
        ItemsMenu cafe_leite = new ItemsMenu("cafe com leite", 20, 400, tabela, 5.60, st);
        ItemsMenu choco_quente = new ItemsMenu("Choco Quente", 158, 400, tabela, 6, st);
        BotaoNav bebidaQuente = new BotaoNav("Bebida Quente", 0, painel1,painel2, painel3);
        BotaoNav bebidaGelada = new BotaoNav("Bebida Gelada", 100, painel1,painel2, painel3);
        BotaoNav lanche_butao = new BotaoNav("Lanche", 200, painel1,painel2, painel3);
        painel1.add(pedido);
        painel1.add(expresso);
        painel1.add(coado);
        painel1.add(americano);
        painel1.add(capocinno);
        painel1.add(latte);
        painel1.add(mocha);
        painel1.add(cafe_leite);
        painel1.add(choco_quente);
        painel1.add(bebidaQuente);
        painel1.add(bebidaGelada);
        painel1.add(lanche_butao);


        JLabel pedido2 = new JLabel("Bebidas Geladas");
        Font fon3 = new Font("Arial", Font.BOLD, 24);
        pedido2.setFont(fon3);
        pedido2.setBounds(58,50,200, 100);
        pedido2.setForeground(Color.BLACK);

        BotaoNav bebidaQuente2 = new BotaoNav("Bebida Quente", 0, painel1,painel2, painel3);
        BotaoNav bebidaGelada2 = new BotaoNav("Bebida Gelada", 100, painel1,painel2, painel3);
        BotaoNav lanche_butao2 = new BotaoNav("Lanche", 200, painel1,painel2, painel3);

        painel2.add(pedido2);
        painel2.add(bebidaQuente2);
        painel2.add(bebidaGelada2);
        painel2.add(lanche_butao2);


        BotaoNav bebidaQuente3 = new BotaoNav("Bebida Quente", 0, painel1,painel2, painel3);
        BotaoNav bebidaGelada3 = new BotaoNav("Bebida Gelada", 100, painel1,painel2, painel3);
        BotaoNav lanche_butao3 = new BotaoNav("Lanche", 200, painel1,painel2, painel3);

        // criando o labe do pedido
        JLabel pedido3 = new JLabel("Lanche");
        Font fon4 = new Font("Arial", Font.BOLD, 24);
        pedido3.setFont(fon4);
        pedido3.setBounds(58,50,200, 100);
        pedido3.setForeground(Color.BLACK);

        painel3.add(pedido3);
        painel3.add(bebidaQuente3);
        painel3.add(bebidaGelada3);
        painel3.add(lanche_butao3);



        // Adicionar os componentes ao JFrame
        frame.add(painel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(textPanel);
        frame.add(data);
        frame.add(painel2);
        frame.add(painel3);

        // Tornar o JFrame visível
        frame.setVisible(true);

        refazer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setRowCount(0); // Limpa todas as linhas da tabela
                st.setText("Subtotal = 0.0"); // Zera o subtotal
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
