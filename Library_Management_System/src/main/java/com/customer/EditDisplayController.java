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
 * Servlet implementation class EditDisplayController
 */
@WebServlet("/EditDisplayController")
public class EditDisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String user1 = (String) session.getAttribute("username");
		String check = "admin";
		
		
		try {
			List<User> userD = UserDBUtil.userValidation(user1);
			request.setAttribute("userD", userD);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
			RequestDispatcher dis = request.getRequestDispatcher("editProfile.jsp");
			dis.forward(request, response);
		
	}

}
