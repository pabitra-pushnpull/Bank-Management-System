package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class SignupInLogin extends JFrame{
	
	private Integer randomNumberGenerator() {
		
		Random randomNumber = new Random();
		Integer randomGeneratedNumber = randomNumber.nextInt(1000 ,9999);
		
		return randomGeneratedNumber;
	}

	public SignupInLogin() {
		
		setLayout(null);
		
		JLabel lblFormNumber = new JLabel("Application Number : " + randomNumberGenerator());
		lblFormNumber.setFont(new Font("Raleway", Font.BOLD, 38));
		lblFormNumber.setBounds(140, 20, 600, 40);
		add(lblFormNumber);
		
		JLabel lblPersonalDetails = new JLabel("Page 1 : Personal Details");
		lblPersonalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		lblPersonalDetails.setBounds(290, 80, 400, 30);
		add(lblPersonalDetails);
		
		JLabel lblName = new JLabel("Name : ");
		lblName.setFont(new Font("Raleway", Font.BOLD, 22));
		lblName.setBounds(100, 140, 100, 30);
		add(lblName);
		
		JTextField txtName = new JTextField();
		txtName.setBounds(280, 140, 200, 30);
		add(txtName);
		
		JLabel lblFathersName = new JLabel("Father's Name : ");
		lblFathersName.setFont(new Font("Raleway", Font.BOLD, 20));
		lblFathersName.setBounds(100, 190, 200, 30);
		add(lblFathersName);
		
		JTextField txtFathersName = new JTextField();
		txtFathersName.setBounds(280, 190, 200, 30);
		add(txtFathersName);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth : ");
		lblDateOfBirth.setFont(new Font("Raleway", Font.BOLD, 20));
		lblDateOfBirth.setBounds(100, 240, 200, 30);
		add(lblDateOfBirth);
		
		JTextField txtDateOfBirth = new JTextField();
		txtDateOfBirth.setBounds(280, 240, 200, 30);
		add(txtDateOfBirth);
		
		JLabel lblGender = new JLabel("Gender : ");
		lblGender.setFont(new Font("Raleway", Font.BOLD, 20));
		lblGender.setBounds(100, 290, 200, 30);
		add(lblGender);
		
		JLabel lblMail = new JLabel("E-Mail : ");
		lblMail.setFont(new Font("Raleway", Font.BOLD, 20));
		lblMail.setBounds(100, 340, 200, 30);
		add(lblMail);
		
		JLabel lblMarriedStatus = new JLabel("Maritial Status : ");
		lblMarriedStatus.setFont(new Font("Raleway", Font.BOLD, 20));
		lblMarriedStatus.setBounds(100, 390, 200, 30);
		add(lblMarriedStatus);
		
		JLabel lblAddress = new JLabel("Address : ");
		lblAddress.setFont(new Font("Raleway", Font.BOLD, 20));
		lblAddress.setBounds(100, 440, 200, 30);
		add(lblAddress);
		
		JLabel lblPinCode = new JLabel("Pin-Code : ");
		lblPinCode.setFont(new Font("Raleway", Font.BOLD, 20));
		lblPinCode.setBounds(100, 490, 200, 30);
		add(lblPinCode);
		
		JLabel lblCity = new JLabel("City : ");
		lblCity.setFont(new Font("Raleway", Font.BOLD, 20));
		lblCity.setBounds(100, 540, 200, 30);
		add(lblCity);
		
		JLabel lblState = new JLabel("State : ");
		lblState.setFont(new Font("Raleway", Font.BOLD, 20));
		lblState.setBounds(100, 590, 200, 30);
		add(lblState);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(750, 770);
		setLocation(410, 30);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new SignupInLogin();
		
	}
	
}
