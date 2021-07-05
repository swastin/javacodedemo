package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		PreparedStatement pstmt=con.prepareStatement("insert into user values(?,?)");
		pstmt.setString(1,"swastin");
		pstmt.setString(2,"Swatin@12345");
		int x=pstmt.executeUpdate();
		System.out.print(x+"row update sucessfully");
		con.close();

	}

}
