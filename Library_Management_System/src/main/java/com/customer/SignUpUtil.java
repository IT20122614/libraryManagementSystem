package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SignUpUtil {
	
	public static boolean signUp(String username, String email, String phone, String password) {
		
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pawd = "1234";
		boolean isTrue = false;
		int i = 0;
		
		
		//Validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pawd);
			
			
			
			String SQL = "INSERT INTO user (username, email, phone, password) VALUES('"+username+"', '"+email+"', '"+phone+"', '"+password+"')";
			PreparedStatement preparedStatement = con.prepareStatement(SQL);

			i = preparedStatement.executeUpdate();
			System.out.println(i+"sql");
			if(i > 0) {
				isTrue = true;
			}

			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isTrue;
	}

	public static boolean editProfile(String username, String email, String phone) {
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pawd = "1234";
		boolean isTrue = false;
		int i = 0;
		
		
		//Validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pawd);
			
			
			
			String SQL = "UPDATE user SET email = '"+email+"', phone = '"+phone+"' WHERE username='"+username+"'";
			PreparedStatement preparedStatement = con.prepareStatement(SQL);

			i = preparedStatement.executeUpdate();
			System.out.println(i+"sql");
			if(i > 0) {
				isTrue = true;
			}

			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isTrue;
	}
	
	

}
