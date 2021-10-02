import java.sql.*;
public class Connection1 {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstprogram","root","sunil1234");
			PreparedStatement ps=con.prepareStatement("INSERT INTO Success userreg(?,?,?,?,?)");
			ps.setInt(1, 6);
			ps.setString(2, "poojari");
			ps.setString(3, "rohit");
			ps.setString(4, "badlapur");
			ps.setString(5, "kalyan");
			
			int i=ps.executeUpdate();
			System.out.println(i+"records inserted:");
			
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
