package com.customer;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.apache.tomcat.util.digester.SetPropertiesRule.Listener;

public class DisplayBookUtil {
	
	public static List<Book> displayBook() {
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String pawd = "1234";
		ArrayList<Book> list = new ArrayList<>();
		ResultSet res;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pawd);
			

			String SQL = "SELECT * FROM book";
			Statement stmt = con.createStatement();
			stmt.executeQuery(SQL);
			res = stmt.getResultSet();
			
			while(res.next()) {
				Book book = new Book();
				String code = res.getString(1);
				String title = res.getString(2);
				String author = res.getString(3);
				Blob blob = res.getBlob(4);	
				String description = res.getString(5);
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
                
                book.setCode(code);
                book.setTitle(title);
                book.setAuthor(author);
                book.setBase64Image(base64Image);
                book.setDescription(description);
                list.add(book);
			}

			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
