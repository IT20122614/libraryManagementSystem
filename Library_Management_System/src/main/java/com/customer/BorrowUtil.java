package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

public class BorrowUtil {
	public static boolean borrowBook(String code, String date, String username) {
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pawd = "1234";
		boolean isTrue = false;
		String status = "borrowed";
		int i = 0;
		
		
		//Validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pawd);
			
			
			
			String SQL = "INSERT INTO borrow (username, code, date, status) VALUES('"+username+"', '"+code+"', '"+date+"', '"+status+"')";
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
