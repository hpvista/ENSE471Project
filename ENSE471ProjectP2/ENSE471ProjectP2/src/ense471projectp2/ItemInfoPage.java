package ense471projectp2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;

public class ItemInfoPage extends JFrame {
	
	public static final int HEIGHT_WINDOW = 1000;
    public static final int WIDTH_WINDOW = 800;
    public static String BACKGROUNDHEX = "#2c2d2d";
    public static String BOTTOMPANELHEX = "#4e4e4f";
    public static Font TitleFont = new Font("Courier", Font.BOLD, 30);
    public static Font ProductNameFont = new Font("Courier", Font.PLAIN, 15);
    public static Border ItemBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
    
	public ItemInfoPage() {
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WIDTH_WINDOW, HEIGHT_WINDOW);
		this.getContentPane().setBackground(Color.decode(BACKGROUNDHEX));
		
		
		//Title of the Item
		JLabel title = new JLabel("Milk 2% 4 Litre");
		title.setFont(TitleFont);
		title.setForeground(Color.WHITE);
		this.add(BorderLayout.NORTH, title);
		
		
		
		//scrollable Panel which contains all the item info
		JPanel mainContentPanel = new JPanel();
		JScrollPane scrollablePanel = new JScrollPane(mainContentPanel);
		scrollablePanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		mainContentPanel.setLayout(new BoxLayout(mainContentPanel,BoxLayout.Y_AXIS));
		mainContentPanel.setPreferredSize(new Dimension(WIDTH_WINDOW, 600));
		mainContentPanel.setBackground(Color.WHITE);
		this.add(BorderLayout.CENTER, scrollablePanel);
		
		//Item Info Labels
		JLabel nameLabel = CreateItemInfoLabel("Name:");
		JLabel priceLabel = CreateItemInfoLabel("Price:");
		JLabel categoryLabel = CreateItemInfoLabel("Category:");
		JLabel manufacturerLabel = CreateItemInfoLabel("Manufacturer:");
		JLabel ratingLabel = CreateItemInfoLabel("Rating:");
		JLabel quantitySoldLabel = CreateItemInfoLabel("Quantity Sold:");
		
		JLabel name = CreateItemInfoLabel("Milk 2% 4 Litre");
		JLabel price = CreateItemInfoLabel("$5.00");
		JLabel category = CreateItemInfoLabel("Dairy Products Food and Drink");
		JLabel manufacturer = CreateItemInfoLabel("Dairy Life");
		ImageIcon ratingStars = new ImageIcon(getClass().getResource("ratingStars.jpg"));
		JLabel rating = new JLabel();
		rating.setIcon(ratingStars);
		rating.setBorder(ItemBorder);
		JLabel quantitySold = CreateItemInfoLabel("1586");
		
		//Grid Panel showing the details of the Item
		JPanel itemInfoPanel = new JPanel();
		itemInfoPanel.setLayout(new GridLayout(6,2,5,5));
		itemInfoPanel.setBackground(Color.WHITE);
		itemInfoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		itemInfoPanel.setMaximumSize(new Dimension(WIDTH_WINDOW, 400));
		
		itemInfoPanel.add(nameLabel);
		itemInfoPanel.add(name);
		itemInfoPanel.add(priceLabel);
		itemInfoPanel.add(price);
		itemInfoPanel.add(categoryLabel);
		itemInfoPanel.add(category);
		itemInfoPanel.add(manufacturerLabel);
		itemInfoPanel.add(manufacturer);
		itemInfoPanel.add(ratingLabel);
		itemInfoPanel.add(rating);
		itemInfoPanel.add(quantitySoldLabel);
		itemInfoPanel.add(quantitySold);
		
		mainContentPanel.add(itemInfoPanel);
		
		//Bottom button Menu
		JPanel ButtonPanel = new JPanel();
        ButtonPanel.setPreferredSize(new Dimension(WIDTH_WINDOW, 150));
        this.getContentPane().add(BorderLayout.SOUTH, ButtonPanel);
        ButtonPanel.setBackground(Color.decode(BOTTOMPANELHEX));

        ButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 25));

        ImageIcon Diamond = new ImageIcon(getClass().getResource("diamond.jpg"));
        JButton Scan = new JButton("Scan");
        Scan.setIcon(Diamond);
        Scan.setPreferredSize(new Dimension(75,75));
        ButtonPanel.add(Scan);

        ImageIcon Square = new ImageIcon(getClass().getResource("square.jpg"));
        JButton Cart = new JButton("Cart");
        Cart.setIcon(Square);
        Cart.setPreferredSize(new Dimension(75,75));
        ButtonPanel.add(Cart);

        ImageIcon MenuIMG = new ImageIcon(getClass().getResource("menu.jpg"));
        JButton Menu = new JButton("Menu");
        Menu.setIcon(MenuIMG);
        Menu.setPreferredSize(new Dimension(75,75));
        ButtonPanel.add(Menu);
        
        //Panel for the lower contents of the main contents panel
        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(new GridLayout(1, 2, 5, 5));
        lowerPanel.setBackground(Color.decode(BACKGROUNDHEX));
        mainContentPanel.add(lowerPanel);
        
        ImageIcon nutritionFacts = new ImageIcon(getClass().getResource("nutritionFacts.jpg"));
        JLabel nutritionFactsLabel = new JLabel(nutritionFacts);
        
        ImageIcon map = new ImageIcon(getClass().getResource("map.jpg"));
        JLabel mapLabel = new JLabel(map);
        JLabel locationsLabel = new JLabel("Locations:");
        locationsLabel.setFont(new Font("Courier", Font.BOLD, 20));
        locationsLabel.setForeground(Color.WHITE);
        
        JPanel locationPanel = new JPanel();
        locationPanel.setLayout(new BoxLayout(locationPanel, BoxLayout.Y_AXIS));
        locationPanel.setBackground(Color.decode(BACKGROUNDHEX));
        locationPanel.setMaximumSize(new Dimension(WIDTH_WINDOW/2, 400));
        locationPanel.add(locationsLabel);
        locationPanel.add(mapLabel);
        
        lowerPanel.add(locationPanel);
        lowerPanel.add(nutritionFactsLabel);
        
        
        
		
		
		
		
	}
	
	public JLabel CreateItemInfoLabel (String text) {
		
		JLabel label = new JLabel(text);	
		label.setFont(ProductNameFont);
		label.setBorder(ItemBorder);
		label.setBackground(Color.decode(BACKGROUNDHEX));
		
		return label;
	}
	
}



















