package com.bridgelabz.loginregistration.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class RegisterFilter
 */
public class RegisterFilter implements Filter {

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		String value = fConfig.getInitParameter("Key");
		System.out.println(value);
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@SuppressWarnings("unused")
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		// pass the request along the filter chain
		String name = request.getParameter("Username");
		String eamil = request.getParameter("Email");
		String mobilenum = request.getParameter("Mobile-number");
		String password = request.getParameter("Confirm-Password");
		String conformPassword = request.getParameter("Password");

		if (name.length() < 2) {
			out.println("Go back ReEnter the Data <---- Name length should be greater then 2 ");
		}
		if (mobilenum.length() < 10) {
			out.println("Go back ReEnter the Data <---- Mobile number should be 10 digits because ur Indian Right! ");
		} 
		if(password != conformPassword)
		{
			out.println("Go back ReEnter the Data<---- Password doesn't Mactch ReEnter the Password");
		}
		else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Filter Destroyed");
	}

}
