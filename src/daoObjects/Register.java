package daoObjects;

import java.sql.*;
import vaoObjects.LoginBean;

public class Register {
	public static boolean register(LoginBean loginJB){
		try{
			Connection con = dbConnect.getConnection();
			PreparedStatement pst = con.prepareStatement("insert into users_tab values(?,?,?,?)");
			pst.setString(1,loginJB.getUsername());
            pst.setString(2,loginJB.getPassword());
            pst.setString(3,loginJB.getAccess());
            pst.setString(4,loginJB.getMailid());
            pst.executeUpdate();
            con.setAutoCommit(true);
            System.out.println("Registration Success");
            return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
