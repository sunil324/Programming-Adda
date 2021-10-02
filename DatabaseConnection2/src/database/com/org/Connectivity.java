package database.com.org;
import java.sql.*;

public class Connectivity {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sunil","root","sunil1234");
			PreparedStatement stmt=con.prepareStatement("insert into singh values(?,?,?,?)");
			stmt.setInt(1, 101);
			stmt.setString(2, "manoj");
			stmt.setString(3, "shiravane");
			stmt.setString(4, "14/07/2021");
			int i=stmt.executeUpdate();
			System.out.println(i+"records inserted");
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		// TODO Auto-generated method stub

	}

}
