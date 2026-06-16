package bank.management.system;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.FontUIResource;

import com.toedter.calendar.JDateChooser;

import java.util.*;
import java.awt.event.*;

public class SignupInLogin extends JFrame implements ActionListener{
	
	JTextField txtCity, txtState, txtName, txtFathersName, txtMail, txtAddress, txtPinCode;
	JDateChooser dateOfBirth;
	JLabel lblLoading, lblError, lblGenderError;
	ButtonGroup btnGroup ;
	boolean validPIN;
	
	JRadioButton btnMale, btnFemale, btnOthers;
	Integer applicationNumber;
	JComboBox<String> comboBox;
	JButton btnNext;
	
	private Integer randomNumberGenerator() {
		Random randomNumber = new Random();
		Integer randomGeneratedNumber = randomNumber.nextInt(1000 ,9999);
		
		return randomGeneratedNumber;
	}

	public SignupInLogin() {
		
		setLayout(null);
		
		applicationNumber = randomNumberGenerator();
		JLabel lblFormNumber = new JLabel("Application Number : " + applicationNumber);
		lblFormNumber.setFont(new Font("Raleway", Font.BOLD, 38));
		lblFormNumber.setBounds(80, 20, 600, 45);
		add(lblFormNumber);
		
		JLabel lblPersonalDetails = new JLabel("Page 1 : Personal Details");
		lblPersonalDetails.setFont(new Font("Sans_Serif", Font.PLAIN, 25));
		lblPersonalDetails.setBounds(170, 80, 400, 30);
		add(lblPersonalDetails);
		
		JLabel lblName = new JLabel("Name : ");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblName.setBounds(40, 140, 100, 30);
		add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(240, 140, 350, 30);
		txtName.setFont(new Font("Raleway", Font.PLAIN, 22));
		add(txtName);
		
		JLabel lblFathersName = new JLabel("Father's Name : ");
		lblFathersName.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblFathersName.setBounds(40, 190, 200, 30);
		add(lblFathersName);
		
		txtFathersName = new JTextField();
		txtFathersName.setBounds(240, 190, 350, 30);
		txtFathersName.setFont(new Font("Raleway", Font.PLAIN, 22));
		add(txtFathersName);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth : ");
		lblDateOfBirth.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblDateOfBirth.setBounds(40, 240, 200, 30);
		add(lblDateOfBirth);
		
		dateOfBirth = new JDateChooser();
		dateOfBirth.setBounds(240, 240, 200, 30);
		add(dateOfBirth);
		
		JLabel lblGender = new JLabel("Gender : ");
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblGender.setBounds(40, 290, 200, 30);
		add(lblGender);
		
		btnMale = new JRadioButton("Male");
		btnMale.setFont(new FontUIResource("Raleway", ABORT, 22));
		btnMale.setBounds(240, 290, 80, 30);
		btnMale.setBackground(Color.LIGHT_GRAY);
		add(btnMale);
		
		btnFemale = new JRadioButton("Female");
		btnFemale.setFont(new FontUIResource("Raleway", ABORT, 22));
		btnFemale.setBounds(340, 290, 100, 30);
		btnFemale.setBackground(Color.LIGHT_GRAY);
		add(btnFemale);
		
		btnOthers = new JRadioButton("Others");
		btnOthers.setFont(new FontUIResource("Raleway", ABORT, 22));
		btnOthers.setBounds(460, 290, 100, 30);
		btnOthers.setBackground(Color.LIGHT_GRAY);
		add(btnOthers);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(btnMale);
		btnGroup.add(btnFemale);
		btnGroup.add(btnOthers);
		
		JLabel lblMail = new JLabel("E-Mail : ");
		lblMail.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblMail.setBounds(40, 340, 200, 30);
		add(lblMail);
		
		txtMail = new JTextField();
		txtMail.setBounds(240, 340, 350, 30);
		txtMail.setFont(new Font("Raleway", Font.PLAIN, 22));
		add(txtMail);
		
		JLabel lblMarriedStatus = new JLabel("Maritial Status : ");
		lblMarriedStatus.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblMarriedStatus.setBounds(40, 390, 200, 30);
		add(lblMarriedStatus);
		
		String[] options = {"","   Married", "   Un-Married","   Divorced"};
		
		comboBox = new JComboBox<String>(options);
		comboBox.setBounds(240, 390, 200, 30);
		comboBox.setFont(new Font("Raleway", Font.PLAIN, 22));
		add(comboBox);
		
		lblGenderError = new JLabel("Please Select !");
		lblGenderError.setFont(new Font("Arial", Font.PLAIN, 14));
		lblGenderError.setForeground(Color.RED);
		lblGenderError.setBounds(240, 420, 300, 20);
		lblGenderError.setVisible(false);
		add(lblGenderError);
		
//		String selected = (String) comboBox.getSelectedItem();
//		System.out.println("Selected: " + selected);
		
		JLabel lblAddress = new JLabel("Address : ");
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblAddress.setBounds(40, 440, 200, 30);
		add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(240, 440, 350, 30);
		txtAddress.setFont(new Font("Raleway", Font.PLAIN, 22));
		add(txtAddress);
		
		JLabel lblPinCode = new JLabel("Pin-Code : ");
		lblPinCode.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblPinCode.setBounds(40, 490, 200, 30);
		add(lblPinCode);
		
		txtPinCode = new JTextField();
		txtPinCode.setBounds(240, 490, 350, 30);
		txtPinCode.setFont(new Font("Raleway", Font.PLAIN, 22));
		add(txtPinCode);
		
		
		txtPinCode.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				checkPin();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				checkPin();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				checkPin();
			}
			
			private void checkPin() {
				
				String pin = txtPinCode.getText().trim();
				
				lblError.setText("");
			    txtCity.setText("");
			    txtState.setText("");
				
				if(pin.length() == 6 && pin.matches("\\d{6}")) {
					fetchLocation(pin);
				}else if (pin.length() != 6) {
			        lblError.setText("Invalid PIN code");
			    }
			}
			
		});
		
		lblLoading = new JLabel("Loading...");
		lblLoading.setFont(new Font("Raleway", Font.ITALIC, 14));
		lblLoading.setForeground(Color.BLUE);
		lblLoading.setBounds(240, 520, 200, 20);
		lblLoading.setVisible(false);
		add(lblLoading);

		lblError = new JLabel("");
		lblError.setFont(new Font("Arial", Font.PLAIN, 14));
		lblError.setForeground(Color.RED);
		lblError.setBounds(240, 515, 300, 20);
		add(lblError);
		
		
		JLabel lblCity = new JLabel("City : ");
		lblCity.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblCity.setBounds(40, 540, 200, 30);
		add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setBounds(240, 540, 350, 30);
		txtCity.setFont(new Font("Raleway", Font.PLAIN, 22));
		add(txtCity);
		
		JLabel lblState = new JLabel("State : ");
		lblState.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblState.setBounds(40, 590, 200, 30);
		add(lblState);
		
		txtState = new JTextField();
		txtState.setBounds(240, 590, 350, 30);
		txtState.setFont(new Font("Raleway", Font.PLAIN, 22));
		add(txtState);
		
		btnNext = new JButton("Next");
		btnNext.setBackground(Color.BLACK);
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Arial", Font.BOLD, 18));
		btnNext.setBounds(350, 650, 100, 30);
		btnNext.addActionListener(this);
		add(btnNext);
		 
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		setTitle("Registration Form : Page 1");
		setSize(650, 740);
		setLocation(430, 40);
		setVisible(true);
		
	}
	
	private void fetchLocation(String pin) {
		
		lblLoading.setVisible(true);
	    lblError.setText("");
		
		new SwingWorker<Boolean, Void>() {
			
			String city = "";
	        String state = "";
	        
	        @Override
	        protected Boolean doInBackground() throws Exception {
	        	
	        	try {
	                URL url = new URL("https://api.postalpincode.in/pincode/" + pin);
	                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	                conn.setRequestMethod("GET");
	                conn.setConnectTimeout(5000);
	                conn.setReadTimeout(5000);
	                
	                conn.setRequestProperty("User-Agent", "Mozilla/5.0");
	                conn.setRequestProperty("Accept", "application/json");

	                BufferedReader in = new BufferedReader(
	                        new InputStreamReader(conn.getInputStream()));
	                String inputLine;
	                StringBuilder response = new StringBuilder();

	                while ((inputLine = in.readLine()) != null) {
	                    response.append(inputLine);
	                }
	                in.close();

	             // Parse JSON
	                org.json.JSONArray arr = new org.json.JSONArray(response.toString());
	                org.json.JSONObject obj = arr.getJSONObject(0);

	                if (obj.getString("Status").equals("Success") && !obj.isNull("PostOffice")) {

	                    org.json.JSONArray postOffices = obj.getJSONArray("PostOffice");

	                    if (postOffices.length() > 0) {
	                        org.json.JSONObject postOffice = postOffices.getJSONObject(0);

	                        city = postOffice.getString("Block");
	                        state = postOffice.getString("State");
	                        
	                        return true;
	                    }
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        	
	        	return false;
	        }
	        
	        protected void done() {
	        	lblLoading.setVisible(false);
	        	
	        	
	        		try {
	        			boolean success = get();
	        			
	        			if (success) {
	        				
						txtCity.setText(city);
						txtState.setText(state);
						
						txtCity.setEditable(false);
						txtState.setEditable(false);
						
						txtCity.setFocusable(false);
						txtState.setFocusable(false);
						lblError.setText("");
						validPIN = true;
						
	                 }else{
	                   	txtCity.setText("");
	                    txtState.setText("");
	                    lblError.setText("Invalid PIN or location not found");
	                    validPIN = false;
	                 }
						
					} catch (Exception e) {
						e.printStackTrace();
						lblError.setText("Something went wrong !");
						
					}
	        		
	        };
	        
		}.execute();
		
	}
	
	
	public static void main(String[] args) {
		
		new SignupInLogin();
		
	}

	@Override
	public void actionPerformed(ActionEvent e){
		
		if (e.getSource() == btnNext) {
		
		Integer formNo = applicationNumber;
		String applicantName = txtName.getText().trim();
		String fatherName = txtFathersName.getText().trim();
		String dobString = ((JTextField)dateOfBirth.getDateEditor().getUiComponent()).getText();
		String gender = null;
		
		if (btnMale.isSelected()) {
			gender = "Male";
		}else if (btnFemale.isSelected()) {
			gender = "Female";
		}else if (btnOthers.isSelected()) {
			gender = "Others";
		}
		
		String mail = txtMail.getText().trim();
		String marriedStatus = null;
		marriedStatus = comboBox.getSelectedItem().toString();
		
		String address = txtAddress.getText().trim();
		String pinString = txtPinCode.getText().trim();
		String city = txtCity.getText().trim();
		String state = txtState.getText().trim();
		
		try {
			
			if (applicantName.equals("")) {
				JOptionPane.showMessageDialog(null, "Name cannot be empty !");
				return;
			}else if (fatherName.equals("")) {
				JOptionPane.showMessageDialog(null, "Father's name cannot be empty !");
				return;
			}else if (dobString.equals("")) {
				JOptionPane.showMessageDialog(null, "Date Of Birth Cannot be null !");
				return;
			}else if (gender == null ||gender.isEmpty() || gender.equals("")) {
				JOptionPane.showMessageDialog(null, "Select your Gender !");
				return;
			}else if (mail.equals("")) {
				JOptionPane.showMessageDialog(null, "Please enter your mail id !");
				return;
			}else if (marriedStatus.isBlank() || marriedStatus.isEmpty()) {
				lblGenderError.setVisible(true);
				return;
			}else if (address.equals("")) {
				JOptionPane.showMessageDialog(null, "Address cannot be Empty !");
				return;
			}else if (pinString.equals("")) {
				JOptionPane.showMessageDialog(null, "Please Enter your 6 digit Pincode !");
				return;
			}else if (validPIN) {
				java.sql.Date sqlDate = null;
				Integer pinCode = null;
				try {
					DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);
					 LocalDate dobTemp = LocalDate.parse(dobString, format);
					 sqlDate = java.sql.Date.valueOf(dobTemp);
				}catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(dateOfBirth, e1);;
				}
			
				try {
					pinCode = Integer.parseInt(pinString);
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1);
				}
				
				MySQL_Connection connection = new MySQL_Connection(formNo, applicantName, 
						fatherName, sqlDate, gender, mail, marriedStatus, 
						address, pinCode, city, state);
				
			}
			
		} catch (Exception e2) {
			System.out.println(e2);
			JOptionPane.showMessageDialog(null, e2);
		}
		
		}
	}
	
	
	
	
	
	
	
	
	
	
}
