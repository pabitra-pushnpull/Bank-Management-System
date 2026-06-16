package bank.management.system;

import java.sql.*;

public class MySQL_Connection {

	Connection conn;
	Statement stmt;
	
	public MySQL_Connection(Integer applicationNumber,
			String applicantName, String fathersName, Date DOB,String gender, 
			String mail, String maritialStatus, String address, 
			Integer pincode, String city, String state){
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_manag", "root", "21augsql@pavi@!");
			
			String sqlQuery = "INSERT INTO signup (ApplicationNumber, ApplicantName, "
					+ "ApplicantFathersName, DateOfBirth, Gender, MailId, "
					+ "MaritialStatus, Address, PinCode, City, State) values "
					+ "(?,?,?,?,?,?,?,?,?,?,?)";  
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			
			ps.setInt(1, applicationNumber);
			ps.setString(2, applicantName);
			ps.setString(3, fathersName);
			ps.setDate(4, DOB);
			ps.setString(5, gender);
			ps.setString(6, mail);
			ps.setString(7, maritialStatus);
			ps.setString(8, address);
			ps.setInt(9, pincode);
			ps.setString(10, city);
			ps.setString(11, state);
			
			ps.executeUpdate();
			
//			stmt = conn.
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}
