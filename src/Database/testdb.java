package Database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class testdb {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
	
	
	String sql = "insert into user(fname,lname,username,password)values('Anwesh','Dahal','anwesh','7878') ";
//		Statement  stm = con.createStatement();
//			stm.execute(sql);
//			con.close();
//			System.out.println("added success");
	
	
	
	
	
	
}
}
