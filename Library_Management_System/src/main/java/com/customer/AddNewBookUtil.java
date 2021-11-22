package com.customer;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class AddNewBookUtil {
	public static int addNewBook(String code, String title, String author, InputStream file) {
		System.out.println(code+"util");
		System.out.println(title+"util");
		
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pawd = "1234";
		int check = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pawd);
			

			String SQL = "INSERT INTO book (code, title, author, file) values ('"+code+"', '"+title+"', '"+author+"', '"+file+"')";
			PreparedStatement preparedStatement = con.prepareStatement(SQL);

			check = preparedStatement.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return check;
	}

}
