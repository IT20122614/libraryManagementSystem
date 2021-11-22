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
 * Servlet implementation class ProfileController
 */
@WebServlet("/ProfileController")
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String user1 = (String) session.getAttribute("username");
		String check = "admin";
		
		
		try {
			List<User> userD = UserDBUtil.userValidation(user1);
			request.setAttribute("userD", userD);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		if(user1.equals(check)) {
			RequestDispatcher dis = request.getRequestDispatcher("adminprofile.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("profile.jsp");
			dis.forward(request, response);
		}
	}

}
