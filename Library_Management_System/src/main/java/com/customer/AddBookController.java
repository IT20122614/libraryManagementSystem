package com.customer;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



@WebServlet("/AddBookController")
@MultipartConfig(maxFileSize = 16177215)
public class AddBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	String url = "jdbc:mysql://localhost:3306/library";
	String user = "root";
	String pawd = "1234";
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = request.getParameter("bcode");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String description = request.getParameter("description");
		InputStream inputStream = null;
		System.out.println(code);
		System.out.println(title);
		String message = null;
		Connection con = null;

  
        
        
        Part filePart = request.getPart("photo");
  
        if (filePart != null) {
  
            // Prints out some information
            // for debugging
        	System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
  
            // Obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
        
        try {
        	Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pawd);
			String sql = "INSERT INTO book (code, title, author, file, description) values (?, ?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, code);
            statement.setString(2, title);
            statement.setString(3, author);
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                statement.setBlob(4, inputStream);
            }
            
            statement.setString(5, description);
            int row = statement.executeUpdate();
            if (row > 0) {
                message = "File uploaded and saved into database";
            }
        	
        }catch (Exception ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        }finally {
            if (con != null) {
                // closes the database connection
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            // sets the message in request scope
            request.setAttribute("Message", message);
             
            // forwards to the message page
            getServletContext().getRequestDispatcher("/addbook.jsp").forward(request, response);
        
        }
        
        
        
	}

}
