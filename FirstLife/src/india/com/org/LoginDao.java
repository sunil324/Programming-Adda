package india.com.org;

import java.sql.*;

public class LoginDao {
public static boolean validate(String name,String pass)	{
	boolean status =false;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("mysql:jdbc://localhost:3306/firstprogram","root","sunil1234");
		PreparedStatement ps=con.prepareStatement("select * from userreg where name=? and pass=?");
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
