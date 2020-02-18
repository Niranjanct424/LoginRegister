package com.bridgelabz.loginregistration.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.loginregistration.model.Login;
import com.bridgelabz.loginregistration.model.Register;
import com.bridgelabz.loginregistration.service.RegisterService;
import com.bridgelabz.loginregistration.utility.Utility;

/**
 * Servlet implementation class RegisterSevlet
 */
@WebServlet("/Register")public class RegisterSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	
	Register regInfo = Utility.getUserObject();
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println();
		regInfo.setUsername(request.getParameter("Username"));
		regInfo.setPhonenumber(request.getParameter("Mobile-number"));
		regInfo.setEmail(request.getParameter("Email"));
		regInfo.setPassword(request.getParameter("Confirm-Password"));
//		System.out.println(regInfo.getEmail());
//		String name = request.getParameter("Username");
		if(Utility.getRegisterService().registerUser(regInfo)>0) {
			response.sendRedirect("Login.jsp");
		}
		
	}

}
