package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ReturnBookController
 */
@WebServlet("/ReturnBookController")
public class ReturnBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		String user1 = (String) session.getAttribute("username");
		
		
		List<Borrow> borrow = ReturnBookUtil.getBorrowedBook(user1);
		request.setAttribute("borrow", borrow);
		
		RequestDispatcher dis = request.getRequestDispatcher("return.jsp");
		dis.forward(request, response);
		
		
	}

}
