package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EditBookUtil {

	public static boolean editBooks(String code, String title, String author) {
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pawd = "1234";
		boolean isTrue = false;
		int i = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pawd);
			
			String sql = "UPDATE book SET title='"+title+"', author='"+author+"' WHERE code='"+code+"'";
			PreparedStatement pStatement = con.prepareStatement(sql);
			
			i = pStatement.executeUpdate();
			if(i > 0) {
				isTrue = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isTrue;
	}

}
