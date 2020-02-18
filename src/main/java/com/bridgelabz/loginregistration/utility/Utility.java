package com.bridgelabz.loginregistration.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.loginregistration.model.Login;
import com.bridgelabz.loginregistration.model.Register;
import com.bridgelabz.loginregistration.repository.UserRepository;
import com.bridgelabz.loginregistration.service.LoginService;
import com.bridgelabz.loginregistration.service.RegisterService;
import com.bridgelabz.loginregistration.serviceimpl.LoginImpl;
import com.bridgelabz.loginregistration.serviceimpl.RegisterImpl;

public class Utility {

	private static String url = "jdbc:mysql://localhost:3306/loginproject?useSSL=false";
	private static String uname = "root";
	private static String password = "niranjan";
	static String query = "select * from Register where username=? and password=?";

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		Utility.url = url;
	}

	public static String getUname() {
		return uname;
	}

	public static void setUname(String uname) {
		Utility.uname = uname;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Utility.password = password;
	}

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection(getUrl(), getUname(), getPassword());
		return con;
	}

	public boolean check(String uname, String upass) {
		try {
			Connection con = getConnection();
			System.out.println("Connection Established");
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, upass);

			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				System.out.println("Query executed");
				return true;
			}
		} catch (Exception e) {
		}
		return false;
	}

	public static Register getUserObject() {
		return new Register();
	}

	public static RegisterService getRegisterService() {
		return new RegisterImpl();
	}

	public static UserRepository getUserRepo() {
		return new UserRepository();
	}

	public static LoginService getLoginService() {
		return new LoginImpl();
	}

	public static Login getLogin() {
		return new Login();
	}
}
