package com.customer;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


public class ReturnBookUtil {

	public static List<Borrow> getBorrowedBook(String user1) {
		
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pawd = "1234";
		ArrayList<Borrow> list = new ArrayList<>();
		String status = "borrowed";
		
		ResultSet res;
		
		
		//Validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pawd);
			
			
			
			String SQL = "select b.title, b.code, b.file, b.author, w.date, b.description from book b, borrow w where b.code = w.code and w.status = '"+status+"' and b.code = (select code from borrow where username = '"+user1+"' and status = '"+status+"')";
			Statement stmt = con.createStatement();
			stmt.executeQuery(SQL);
			res = stmt.getResultSet();
			
			
			while(res.next()) {
				Borrow us = new Borrow();
				String title = res.getString(1);
				String code = res.getString(2);
				Blob blob = res.getBlob(3);	
				String author = res.getString(4);
				String date = res.getString(5);
				String description = res.getString(6);
				InputStream inputStream = blob.getBinaryStream();
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int bytesRead = -1;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);                  
                }
                 
                byte[] imageBytes = outputStream.toByteArray();
                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                inputStream.close();
                outputStream.close();
                
                us.setTitle(title);
                us.setCode(code);
                us.setBase64Image(base64Image);
                us.setAuthor(author);               
                us.setDate(date);
                us.setDescription(description);
                list.add(us);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static boolean returnConfirm(String username, String code, String date) {
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pawd = "1234";
		boolean isTrue = false;
		String status = "returned";
		int i = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pawd);
			
			String SQL = "UPDATE borrow SET status='"+status+"' WHERE username='"+username+"' AND code='"+code+"' AND date LIKE'%"+date+"%'";
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
