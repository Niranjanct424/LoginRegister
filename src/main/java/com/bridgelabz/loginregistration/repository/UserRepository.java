package com.bridgelabz.loginregistration.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.loginregistration.model.Register;
import com.bridgelabz.loginregistration.utility.Utility;

public class UserRepository {
	PreparedStatement pstmt = null;

	public int addUser(Register regInfo) {
		System.out.println(regInfo.getPhonenumber());

		String insertQuery = "INSERT into Register values(default,?,?,?,?)";
		try {
			pstmt = Utility.getConnection().prepareStatement(insertQuery);
			pstmt.setString(1, regInfo.getUsername());
			pstmt.setString(2, regInfo.getEmail());
			pstmt.setString(3, regInfo.getPhonenumber());
			pstmt.setString(4, regInfo.getPassword());

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static boolean login(String username, String password) {

		String query = "select * from Register where username=? and password=?";

		try {
			PreparedStatement prst = Utility.getConnection().prepareStatement(query);
			prst.setString(1, username);
			prst.setString(2, password);
			
			ResultSet rt = prst.executeQuery();
			if(rt.next())
			{
				System.out.println("Query executed");
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
