package jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("hello dear");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hb_many_to_many","hbstudent","hbstudent");
		
		System.out.println("again hello");
		
		

	}

}
