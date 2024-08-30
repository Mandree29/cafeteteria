import view.BotaoNav;
import view.BotoesCaixa;
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


        ImageIcon bebida_quente_png = new ImageIcon("sementes_cafe.png");
        Image cafe = bebida_quente_png.getImage();
        Image cafe_remimensionado = cafe.getScaledInstance(88,88, Image.SCALE_SMOOTH);
        ImageIcon cafeicone = new ImageIcon(cafe_remimensionado);
        JLabel pedido = new JLabel(cafeicone);
        pedido.setBounds(58,40,200, 100);


        // Cria o JLabel e define o ícone da imagem

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
        panel3.setBackground(new Color(240,240,240,255));
        panel3.setLayout(null);

        JLabel st = new JLabel("Subtotal = 0.0");
        Font font2 = new Font("Arial", Font.BOLD, 20);
        st.setFont(font2);
        st.setForeground(Color.darkGray);
        st.setBounds(250, 32, 200, 30);


        BotoesCaixa refazer = new BotoesCaixa("Refazer", 20, tabela,st, frame);
        BotoesCaixa fechar = new BotoesCaixa("Fechar", 540, tabela, st, frame);


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


        ImageIcon bebidageladapng = new ImageIcon("bebida_gelada.png");
        Image gelada = bebidageladapng.getImage();
        Image geladapreparada = gelada.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon geladaicone = new ImageIcon(geladapreparada);
        JLabel pedido2 = new JLabel(geladaicone);
        pedido2.setBounds(58,40,200, 100);

        ItemsMenu refrigerante = new ItemsMenu("Refrigerante", 20,160, tabela, 5.00, st);
        ItemsMenu agua = new ItemsMenu("Agua", 158, 160,tabela,4.50, st);
        ItemsMenu limonada = new ItemsMenu("Limonada",20, 240, tabela, 6.70, st);
        ItemsMenu cafe_gelado = new ItemsMenu("Cafe Gelado", 158, 240, tabela, 14.50, st);
        ItemsMenu frapuccino = new ItemsMenu("Frapuccino", 20, 320, tabela, 18.80, st);
        ItemsMenu smoothie = new ItemsMenu("Smothie", 158, 320, tabela, 5.95, st);
        ItemsMenu cha_gelado = new ItemsMenu("cafe com leite", 20, 400, tabela, 9.90, st);
        ItemsMenu milkshake = new ItemsMenu("milkshake", 158, 400, tabela, 14.00, st);
        BotaoNav bebidaQuente2 = new BotaoNav("Bebida Quente", 0, painel1,painel2, painel3);
        BotaoNav bebidaGelada2 = new BotaoNav("Bebida Gelada", 100, painel1,painel2, painel3);
        BotaoNav lanche_butao2 = new BotaoNav("Lanche", 200, painel1,painel2, painel3);

        painel2.add(pedido2);
        painel2.add(refrigerante);
        painel2.add(agua);
        painel2.add(limonada);
        painel2.add(cafe_gelado);
        painel2.add(frapuccino);
        painel2.add(smoothie);
        painel2.add(cha_gelado);
        painel2.add(milkshake);
        painel2.add(bebidaQuente2);
        painel2.add(bebidaGelada2);
        painel2.add(lanche_butao2);




        // criando o labe do pedido
//        JLabel pedido3 = new JLabel("Lanche");
//        Font fon4 = new Font("Arial", Font.BOLD, 24);
//        pedido3.setFont(fon4);
//        pedido3.setBounds(58,50,200, 100);
//        pedido3.setForeground(Color.BLACK);

        ImageIcon comida = new ImageIcon("comida.png");
        Image croassant = comida.getImage();
        Image lanche = croassant.getScaledInstance(80,80, Image.SCALE_SMOOTH);
        ImageIcon lancheicone = new ImageIcon(lanche);
        JLabel pedido3 = new JLabel(lancheicone);
        pedido3.setBounds(58,40,200, 100);
//
        ItemsMenu pao_de_queijo = new ItemsMenu("Pao de queijo", 20 ,160, tabela, 6.00, st);
        ItemsMenu sanduiche = new ItemsMenu("Sanduiche", 158, 160,tabela, 15.50, st);
        ItemsMenu torrada = new ItemsMenu("torrada",20, 240, tabela, 5.70, st);
        ItemsMenu bolo = new ItemsMenu("Bolo", 158, 240, tabela, 10.50, st);
        ItemsMenu muffin = new ItemsMenu("Muffin", 20, 320, tabela, 8.80, st);
        ItemsMenu salada = new ItemsMenu("Salada", 158, 320, tabela, 12.00, st);
        ItemsMenu quiche = new ItemsMenu("Quiche", 20, 400, tabela, 14.00, st);
        ItemsMenu croissant = new ItemsMenu("Croissant", 158, 400, tabela, 10.00, st);
        BotaoNav bebidaQuente3 = new BotaoNav("Bebida Quente", 0, painel1,painel2, painel3);
        BotaoNav bebidaGelada3 = new BotaoNav("Bebida Gelada", 100, painel1,painel2, painel3);
        BotaoNav lanche_butao3 = new BotaoNav("Lanche", 200, painel1,painel2, painel3);
        painel3.add(pedido3);
        painel3.add(pao_de_queijo);
        painel3.add(sanduiche);
        painel3.add(torrada);
        painel3.add(bolo);
        painel3.add(muffin);
        painel3.add(salada);
        painel3.add(quiche);
        painel3.add(croissant);
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


    }




}
