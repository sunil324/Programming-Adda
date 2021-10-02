package com.org.in;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CONNECTION
 */
@WebServlet("/CONNECTION")
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Success() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("name");
		String e=request.getParameter("email");
		String p=request.getParameter("password");
		String r=request.getParameter("repassword");
				
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/REGISTER","root","sunil1234");
			
			PreparedStatement ps=con.prepareStatement("insert into LOGIN values(?,?,?,?)");
			ps.setString(1, n);
			ps.setString(2, e);
			ps.setString(3, p);
			ps.setString(4, r);
			
			int i=ps.executeUpdate();
			
			
			if(i>0) {
				System.out.println("Successfully Registered:");
				
			}
			
			
			
			
			
			
		
			
			
			
			
			
		}catch(Exception e2) {
			System.out.println(e2);
			
			
			
			out.close();
		}
		
		
		
		
		
		
		
	}

}
