package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDBUtil {
	
	public static List<User> validateUser(String username, String password){
		
		ArrayList<User> list = new ArrayList<>();
		
		
		//Create DB connection
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pawd = "1234";
		
		
		//Validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pawd);
			
			Statement stmt = con.createStatement();
			
			String sqlQuery = "select * from user where username='"+username+"' and password='"+password+"';";
			ResultSet rs = stmt.executeQuery(sqlQuery);
			

			
			if(rs.next()) {
				
				String userName = rs.getString(1);
				String email = rs.getString(2);
				String phone = rs.getString(3);
				String passwords = rs.getString(4);
				
				
				User us = new User(userName, email, passwords, phone);
				list.add(us);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	public static List<User> userValidation(String username){
		ArrayList<User> list = new ArrayList<>();
		
		
		//Create DB connection
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pawd = "1234";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pawd);
			
			Statement stmt = con.createStatement();
			
			String sqlQuery = "select * from user where username='"+username+"';";
			ResultSet rs = stmt.executeQuery(sqlQuery);
			

			
			if(rs.next()) {
				
				String userName = rs.getString(1);
				String email = rs.getString(2);
				String phone = rs.getString(3);
				String passwords = rs.getString(4);
				
				
				User us = new User(userName, email, passwords, phone);
				list.add(us);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}

}
