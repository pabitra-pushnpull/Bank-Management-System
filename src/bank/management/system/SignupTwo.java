package bank.management.system;

import java.awt.*;

import javax.swing.*;

public class SignupTwo extends JFrame {
	
	ButtonGroup btnReligionsGroup;
	JRadioButton hindu, muslim, otherReligion;
	JButton btnNext;

	public SignupTwo() {
		
		setLayout(null);
//		setLayout(new FlowLayout());
		
		setTitle("Registration Form : Page 2");
//		setSize(600,700);
		setSize(700,800);
		setLocation(430, 70);
		setVisible(true);
		
		
		JLabel lblAdditionalDetails = new JLabel("Page 2 : Additional Details");
		lblAdditionalDetails.setFont(new Font("Sans_Serif", Font.PLAIN, 25));
		lblAdditionalDetails.setBounds(170, 50, 400, 30);
		add(lblAdditionalDetails);
		
		JLabel lblReligion = new JLabel("Religion : ");
		lblReligion.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblReligion.setBounds(40, 90, 200, 30);
		add(lblReligion);
		
		hindu = new JRadioButton("Hindu");
		hindu.setBounds(250, 90, 90, 30);
		hindu.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(hindu);
		
		muslim = new JRadioButton("Muslim");
		muslim.setBounds(340, 90, 100, 30);
		muslim.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(muslim);
		
		otherReligion = new JRadioButton("Others");
		otherReligion.setBounds(440, 90, 90, 30);
		otherReligion.setFont(new Font("Raleway", Font.PLAIN, 20));
		add(otherReligion);
		
		btnReligionsGroup = new ButtonGroup();
		btnReligionsGroup.add(hindu);
		btnReligionsGroup.add(muslim);
		btnReligionsGroup.add(otherReligion);
		
		JLabel lblCategory = new JLabel("Category : ");
		lblCategory.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblCategory.setBounds(40, 140, 200, 30);
		add(lblCategory);
		
		Integer[] nums = {12,3,43,35,8};
		JComboBox<Integer> dd = new JComboBox<Integer>(nums);
		dd.setBounds(250, 150, 150, 30);
		add(dd);
		
		JLabel lblIncome = new JLabel("Income : ");
		lblIncome.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblIncome.setBounds(40, 190, 200, 30);
		add(lblIncome);
		
		JLabel lblEducation = new JLabel("Education : ");
		lblEducation.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblEducation.setBounds(40, 240, 200, 30);
		add(lblEducation);
		
		JLabel lblQualification = new JLabel("Qualification : ");
		lblQualification.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblQualification.setBounds(40, 290, 200, 30);
		add(lblQualification);
		
		JLabel lblOccupation = new JLabel("Occupation : ");
		lblOccupation.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblOccupation.setBounds(40, 340, 200, 30);
		add(lblOccupation);
		
		JLabel lblAadharNumber = new JLabel("Aadhar Number : ");
		lblAadharNumber.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblAadharNumber.setBounds(40, 390, 200, 30);
		add(lblAadharNumber);
		
		JLabel lblPanNumber = new JLabel("PAN Number : ");
		lblPanNumber.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblPanNumber.setBounds(40, 440, 200, 30);
		add(lblPanNumber);
		
		JLabel lblSeniorCitizen = new JLabel("Senior Citizen : ");
		lblSeniorCitizen.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblSeniorCitizen.setBounds(40, 490, 200, 30);
		add(lblSeniorCitizen);
		
		JLabel lblExistingAccount = new JLabel("Existing Account : ");
		lblExistingAccount.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblExistingAccount.setBounds(40, 540, 200, 30);
		add(lblExistingAccount);
		
		
		
		btnNext = new JButton("Next");
		btnNext.setBounds(270, 590, 80, 30);
		btnNext.setBackground(Color.BLACK);
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Arial",Font.BOLD,18));
		add(btnNext);
		
	}
	
	public static void main(String[] args) {
		new SignupTwo();
	}
	
}
