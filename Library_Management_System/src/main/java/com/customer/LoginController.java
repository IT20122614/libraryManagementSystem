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


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		String user1 = (String) session.getAttribute("username");
		System.out.println(user1 + "user Name Display session");
		String check = "admin";
		
		
		try {
			
			List<User> userD = UserDBUtil.validateUser(username, password);
			request.setAttribute("userD", userD);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		if(username.equals(check)) {
			RequestDispatcher dis = request.getRequestDispatcher("adminprofile.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("profile.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
