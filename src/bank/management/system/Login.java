package bank.management.system;

import java.awt.*;

import javax.swing.*;

public class Login extends JFrame{

	public Login() {
		setTitle("Bank Management System");
		
		setLayout(null);
		
		ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image img2 = img1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon img3 = new ImageIcon(img2);
		JLabel lbl = new JLabel(img3);
		lbl.setBounds(60, 15, 100, 100);
		add(lbl);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
	}
	
	public static void main(String[] args) {
		new Login();
	}
	
}
