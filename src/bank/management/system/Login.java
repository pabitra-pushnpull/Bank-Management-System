package bank.management.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JButton login, clear, signUp;
	JTextField cardTextField;
	JPasswordField pinTextField;

	public Login() {
		setTitle("Bank Management System");
		setLayout(null);
		
		ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image img2 = img1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon img3 = new ImageIcon(img2);
		JLabel lbl = new JLabel(img3);
		lbl.setBounds(60, 15, 100, 100);
		add(lbl);
		
		JLabel headText = new JLabel("Welcome to ATM !");
		headText.setFont(new Font("Osward", Font.BOLD, 38));
		headText.setBounds(200, 40, 400, 40);
		add(headText);
		
		JLabel cardNo = new JLabel("Card No. : ");
		cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
		cardNo.setBounds(120, 150, 150, 30);
		add(cardNo);
		
		cardTextField = new JTextField();
		cardTextField.setBounds(300, 150, 230, 30);
		cardTextField.setFont(new Font("Arial", Font.BOLD, 15));
		add(cardTextField);
		
		JLabel pin = new JLabel("PIN : ");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(120, 220, 250, 30);
		add(pin);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 220, 230, 30);
		pinTextField.setFont(new Font("Arial", Font.BOLD, 15));
		add(pinTextField);
		
		login = new JButton("Sign In");
		login.setBounds(300, 300, 100, 30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("Clear");
		clear.setBounds(430, 300, 100, 30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		signUp = new JButton("Sign Up");
		signUp.setBounds(360, 350, 100, 30);
		signUp.setBackground(Color.BLACK);
		signUp.setForeground(Color.WHITE);
		signUp.addActionListener(this);
		add(signUp);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == login) {
			
		}else if (e.getSource() == clear) {
			
			cardTextField.setText("");
			pinTextField.setText("");
			
		}else if (e.getSource() == signUp) {
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Hello !");
		
		new Login();
		
	}

	
	
}
