package com.check.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl="jdbc:mysql://localhost:3306/data_order?useSSL=false";
		String user="root";
		String pass="sunil1234";
		
		
		
		try {
			
			System.out.println("Connecting to database:"+jdbcUrl);
			Connection myConn=DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection Successfully:");
			
			
			
		}catch(Exception exe) {
			exe.printStackTrace();
			
		}

	}

}
