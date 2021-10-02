package com.login.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	public static boolean validate(String name,String pass) {
		boolean status=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("mysql:jdbc://localhost:3306/sunil","root","sunil1234");
			PreparedStatement ps=con.prepareStatement("select * from singh where name=? and pass=?");
			ps.setString(1, name);
			ps.setString(2, pass);
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
			}catch(Exception e) {
				System.out.println(e);
			}
		return status;
	}

}
