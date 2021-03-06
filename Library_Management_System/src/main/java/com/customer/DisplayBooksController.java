package com.customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayBooksController")
public class DisplayBooksController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			
			List<Book> list = DisplayBookUtil.displayBook();
			request.setAttribute("list", list);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dis = request.getRequestDispatcher("display.jsp");
		dis.forward(request, response);
	}

}
