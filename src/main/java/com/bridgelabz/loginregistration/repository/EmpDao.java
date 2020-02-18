package com.bridgelabz.loginregistration.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.loginregistration.model.Emp;

public class EmpDao {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginproject", "root", "niranjan");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static List<Emp> getRecords(int start, int total) {
		List<Emp> list = new ArrayList<Emp>();
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Register limit " + (start - 1) + "," + total);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Emp e = new Emp();
				e.setUserid(rs.getInt(1));
				e.setUname((rs.getString(2)));
				e.setPassword((rs.getString(3)));
				e.setMobile((rs.getString(4)));
				e.setEmail((rs.getString(5)));
				list.add(e);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}