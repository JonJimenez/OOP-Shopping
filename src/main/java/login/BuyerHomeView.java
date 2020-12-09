package login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author jonat
 */
public class BuyerHomeView extends JFrame{
    JLabel menuBar = new JLabel();
    JButton signout = new JButton("Sign Out");
    JButton cart = new JButton("Cart");
    JLabel info = new JLabel();
    Color bg = new Color(221,221,221);
    JLabel profile = new JLabel();
    JLabel cityState = new JLabel();
    JLabel profileCity = new JLabel();
    JLabel history = new JLabel();
    JLabel historyTitle = new JLabel("Inventory");
    BuyerAccount currentUser;
    JList displayInventory = new JList();
    public BuyerHomeView(){
        build();
    }
    public void build(){
        String name = "Brent Werne";
        Color backGround = new Color(151, 186, 255);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width=(int)screenSize.getWidth();
        int height = (int)screenSize.getHeight();
        this.setBounds(width/8, 1, width-width/4, height);
	JLabel profileName = new JLabel(name);
	JLabel profilePic = new JLabel();
	JLabel cardHolder = new JLabel("Card Holder Name:");
	JLabel profileName1 = new JLabel(name);

	
	menuBar.setBounds(0, 0, width-width/4, 100);
	menuBar.setBackground(backGround);
	menuBar.setOpaque(true);
	menuBar.setBorder(BorderFactory.createLineBorder(Color.black));
		
	//Home label
	signout.setBounds(0, 0, 200, 100);
	signout.setBorder(BorderFactory.createLineBorder(Color.black));
	signout.setLayout(null);
	signout.setHorizontalAlignment(JTextField.CENTER);
		
	signout.setFont(new Font("Arial", Font.BOLD, 35));
	signout.setBackground(backGround);
	signout.setOpaque(true);
	signout.setForeground(Color.white);
		
	//Shopping Cart
	cart.setBounds(width-width/4-200, 0, 200, 100);
	cart.setBorder(BorderFactory.createLineBorder(Color.black));
	cart.setLayout(null);
	cart.setHorizontalAlignment(JTextField.CENTER);
		
	cart.setFont(new Font("Arial", Font.BOLD, 35));
	cart.setBackground(backGround);
	cart.setOpaque(true);
	cart.setForeground(Color.white);
		
	//Profile information
	info.setBounds(0, 100, width-width/4, height-100);
	info.setBackground(bg);
	info.setOpaque(true);
	info.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
	//Profile section
	profile.setBounds(20, 70, (width-width/4)/2-30, height-300);
	profile.setBorder(BorderFactory.createLineBorder(Color.black));
	profile.setLayout(null);
	profile.setBackground(backGround);
	profile.setOpaque(true);
		
	//Profile name
	profileName.setBounds(0, 0, (width-width/4)/2-30, 40);
	profileName.setBorder(BorderFactory.createLineBorder(Color.black));
	profileName.setHorizontalAlignment(JTextField.CENTER);
	profileName.setBackground(backGround);
	profileName.setOpaque(true);
		
	profileName.setFont(new Font("Arial", Font.BOLD, 35));
	profileName.setForeground(Color.white);
		
	profilePic.setBounds(10, 50, 231, 257);
	profilePic.setOpaque(true);
	profilePic.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
	//Card holder label
	cardHolder.setBounds(250, 50, 200, 50);
	cardHolder.setFont(new Font("Arial", Font.BOLD, 20));
	
	//Card holder name
	profileName1.setBounds(250, 80, 200, 50);
	profileName1.setFont(new Font("Arial", Font.BOLD, 20));
						
	//Purchase History
	history.setBounds((width-width/4)/2 + 10, 70, (width-width/4)/2-30, height-300);
	history.setBorder(BorderFactory.createLineBorder(Color.black));
	history.setLayout(null);
	history.setBackground(backGround);
	history.setOpaque(true);
		
		
	//Purchase History Label
	historyTitle.setBounds(0, 0, (width-width/4)/2-30, 40);
	historyTitle.setBorder(BorderFactory.createLineBorder(Color.black));
	historyTitle.setHorizontalAlignment(JTextField.CENTER);
	historyTitle.setBackground(backGround);
	historyTitle.setOpaque(true);
		
	historyTitle.setFont(new Font("Arial", Font.BOLD, 35));
	historyTitle.setForeground(Color.white);
		
		
	this.add(info);
	this.add(menuBar);
	profile.add(cityState);
	profile.add(profileCity);
	profile.add(profileName1);
	profile.add(cardHolder);
	profile.add(profileName);
	profile.add(profilePic);
	menuBar.add(signout);
	menuBar.add(cart);
	info.add(profile);
	history.add(historyTitle);
	info.add(history);
		
		
	this.setBackground(bg);
	this.setLayout(null);
    
    }
}
