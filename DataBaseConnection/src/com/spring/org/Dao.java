package com.spring.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/instagram_01","root","sunil1234");	
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
		
	}
	
	public static List<Pojo>getAllUser() throws SQLException{
		List<Pojo> list=new ArrayList<Pojo>();
		Connection con=Dao.getConnection();
		PreparedStatement stmt=con.prepareStatement("insert into user_01(name,password) values(?,?)");
		ResultSet rs=stmt.executeQuery();
		try {
		while(rs.next()) {
			Pojo p=new Pojo();
			p.setName(rs.getString(1));
			p.setPassword(rs.getString(2));
			list.add(p);
		}
		con.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return list;


}
}