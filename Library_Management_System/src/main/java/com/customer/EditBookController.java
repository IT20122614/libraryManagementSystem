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
 * Servlet implementation class EditBookController
 */
@WebServlet("/EditBookController")
public class EditBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String code = request.getParameter("code");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		HttpSession session = request.getSession();
		String user1 = (String) session.getAttribute("username");
		String check = "admin";
		
		boolean isTrue = EditBookUtil.editBooks(code, title, author);
		
		try {
			List<User> userD = UserDBUtil.userValidation(user1);
			request.setAttribute("userD", userD);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher dis = request.getRequestDispatcher("adminprofile.jsp");
		dis.forward(request, response);
	}

}
