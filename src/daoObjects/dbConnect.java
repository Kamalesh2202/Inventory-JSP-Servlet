package daoObjects;

import java.sql.*;

public class dbConnect {
	private static Connection con;
	
	public static Connection getConnection(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYS AS SYSDBA","cosmos2709");
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
}
