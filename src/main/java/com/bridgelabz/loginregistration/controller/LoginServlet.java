package com.bridgelabz.loginregistration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bridgelabz.loginregistration.model.Login;
import com.bridgelabz.loginregistration.service.LoginService;
import com.bridgelabz.loginregistration.utility.Utility;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Loginuser")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Login log = Utility.getLogin();

		log.setUsername(request.getParameter("uname"));
		log.setPassword(request.getParameter("upass"));

		LoginService loginservice = Utility.getLoginService();
		
		if (loginservice.userLoginCheck(log.getUsername(), log.getPassword())) {
			HttpSession session = request.getSession();
			session.setAttribute("user", log.getUsername());
			//response.sendRedirect("MyProfile.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("MyProfile.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("in else block");
		}
	}
}
