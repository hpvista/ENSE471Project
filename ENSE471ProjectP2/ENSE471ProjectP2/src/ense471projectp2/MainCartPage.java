package ense471projectp2;

import java.awt.*;
import javax.swing.*;

public class MainCartPage extends JFrame {

    public static final int HEIGHT_WINDOW = 1000;
    public static final int WIDTH_WINDOW = 800;
    public static String BACKGROUNDHEX = "#2c2d2d";
    public static String BOTTOMPANELHEX = "#4e4e4f";
    public static Font TitleFont = new Font("Courier", Font.BOLD, 25);
    public static Font ProductNameFont = new Font("Courier", Font.PLAIN, 15);

    public MainCartPage() {

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(WIDTH_WINDOW, HEIGHT_WINDOW));
        this.setBackground(Color.decode(BACKGROUNDHEX));

        //Bottom button Menu     
        JPanel ButtonPanel = new JPanel();
        ButtonPanel.setPreferredSize(new Dimension(WIDTH_WINDOW, 150));
        this.getContentPane().add(BorderLayout.SOUTH, ButtonPanel);
        ButtonPanel.setBackground(Color.decode(BOTTOMPANELHEX));

        ButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 25));

        ImageIcon Diamond = new ImageIcon(getClass().getResource("diamond.jpg"));
        JButton Scan = new JButton("Scan");
        Scan.setIcon(Diamond);
        Scan.setPreferredSize(new Dimension(75, 75));
        ButtonPanel.add(Scan);

        ImageIcon Square = new ImageIcon(getClass().getResource("square.jpg"));
        JButton Cart = new JButton("Cart");
        Cart.setIcon(Square);
        Cart.setPreferredSize(new Dimension(75, 75));
        ButtonPanel.add(Cart);

        ImageIcon MenuIMG = new ImageIcon(getClass().getResource("menu.jpg"));
        JButton Menu = new JButton("Menu");
        Menu.setIcon(MenuIMG);
        Menu.setPreferredSize(new Dimension(75, 75));
        ButtonPanel.add(Menu);

        //Central Panel
        JPanel MainPanel = new JPanel();
        MainPanel.setBackground(Color.decode(BACKGROUNDHEX));
        this.getContentPane().add(BorderLayout.CENTER, MainPanel);

        //
        JPanel CenteredPanel = new JPanel(new BorderLayout());
        CenteredPanel.setBackground(Color.white);
        MainPanel.add(BorderLayout.CENTER, CenteredPanel);

        JLabel Title = new JLabel("Michael Mogentale's Cart");
        Title.setFont(TitleFont);
        CenteredPanel.add(BorderLayout.NORTH, Title);

        JPanel CartPanel = new JPanel();
        CartPanel.setLayout(new BoxLayout(CartPanel, BoxLayout.Y_AXIS));

        //Milk Product ProductA
        JPanel ProductA = new JPanel(new BorderLayout());
        ProductA.setSize(new Dimension(100, 200));
        JLabel TitleMilk = new JLabel("Milk 2% 4 Litre");

        TitleMilk.setFont(ProductNameFont);
        ProductA.add(Box.createVerticalStrut(20));
        ProductA.add(BorderLayout.NORTH, TitleMilk);
        ProductA.add(Box.createVerticalStrut(20));

        JPanel Item1 = new JPanel();
        Item1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Item1.setLayout(new FlowLayout(FlowLayout.CENTER, 160, 40));
        ImageIcon image = new ImageIcon(getClass().getResource("squareNoLabel.jpg"));
        JLabel imagePanel = new JLabel("", image, JLabel.CENTER);
        Item1.add(imagePanel);
        Item1.add(new JLabel("Quantity: 2"));
        Item1.add(new JLabel("$10.00"));
        ProductA.add(BorderLayout.CENTER, Item1);
        //End of ProductA

        //Broccoli ProductB
        JPanel ProductB = new JPanel(new BorderLayout());
        ProductB.setSize(new Dimension(100, 200));
        JLabel TitleBroc = new JLabel("Broccoli");

        TitleBroc.setFont(ProductNameFont);
        ProductB.add(BorderLayout.NORTH, TitleBroc);
        ProductB.add(Box.createVerticalStrut(20));

        JPanel Item2 = new JPanel();
        Item2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Item2.setLayout(new FlowLayout(FlowLayout.CENTER, 160, 40));
        ImageIcon image1 = new ImageIcon(getClass().getResource("squareNoLabel.jpg"));
        JLabel imagePanel1 = new JLabel("", image1, JLabel.CENTER);
        Item2.add(imagePanel1);
        Item2.add(new JLabel("Quantity: 2"));
        Item2.add(new JLabel("$5.25"));
        ProductB.add(BorderLayout.CENTER, Item2);
        //End of Product B

        //Free Range chicken breast ProductC
        JPanel ProductC = new JPanel(new BorderLayout());
        ProductC.setSize(new Dimension(100, 200));
        JLabel TitleChicken = new JLabel("Free Range Chicken Breast");

        TitleChicken.setFont(ProductNameFont);
        ProductC.add(BorderLayout.NORTH, TitleChicken);
        ProductC.add(Box.createVerticalStrut(20));

        JPanel Item3 = new JPanel();
        Item3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Item3.setLayout(new FlowLayout(FlowLayout.CENTER, 160, 40));
        ImageIcon image2 = new ImageIcon(getClass().getResource("squareNoLabel.jpg"));
        JLabel imagePanel2 = new JLabel("", image2, JLabel.CENTER);
        Item3.add(imagePanel2);
        Item3.add(new JLabel("Quantity: 2"));
        Item3.add(new JLabel("$25.25"));
        ProductC.add(BorderLayout.CENTER, Item3);
        //End of Product C

        //Bee Movie ProductD
        JPanel ProductD = new JPanel(new BorderLayout());
        ProductD.setSize(new Dimension(100, 200));
        JLabel TitleBee = new JLabel("Bee Movie");

        TitleBee.setFont(ProductNameFont);
        ProductD.add(BorderLayout.NORTH, TitleBee);
        ProductD.add(Box.createVerticalStrut(20));

        JPanel Item4 = new JPanel();
        Item4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Item4.setLayout(new FlowLayout(FlowLayout.CENTER, 160, 40));
        ImageIcon image3 = new ImageIcon(getClass().getResource("squareNoLabel.jpg"));
        JLabel imagePanel3 = new JLabel("", image3, JLabel.CENTER);
        Item4.add(imagePanel3);
        Item4.add(new JLabel("Quantity: 2"));
        Item4.add(new JLabel("$25.25"));
        ProductD.add(BorderLayout.CENTER, Item4);
        //End of Product D

        CartPanel.add(Box.createVerticalStrut(40));
        CartPanel.add(ProductA);
        CartPanel.add(Box.createVerticalStrut(40));
        CartPanel.add(ProductB);
        CartPanel.add(Box.createVerticalStrut(40));
        CartPanel.add(ProductC);
        CartPanel.add(Box.createVerticalStrut(40));
        CartPanel.add(ProductD);
        CartPanel.add(Box.createVerticalStrut(40));

        JLabel Total = new JLabel("Total: $43.50");
        Total.setFont(TitleFont);
        Total.setAlignmentX(RIGHT_ALIGNMENT);

        CenteredPanel.add(BorderLayout.CENTER, CartPanel);
        CenteredPanel.add(BorderLayout.SOUTH, Total);
    }
}
