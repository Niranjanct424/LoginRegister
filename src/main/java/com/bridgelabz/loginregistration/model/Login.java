package com.bridgelabz.loginregistration.model;

public class Login {
	private String username;
	private String password;
	
	/**
	 * getter and setters to access private variables
	 * @return
	 */
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login() {
		super();
	}

}
