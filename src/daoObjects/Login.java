package daoObjects;

import java.sql.*;
import daoObjects.dbConnect;
import vaoObjects.LoginBean;

public class Login {
	public static boolean login(LoginBean loginJB){
		try{
			ResultSet rs;
			Connection con = dbConnect.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from users_tab where userid='" + loginJB.getUsername() + "' and userpass='" + loginJB.getPassword() + "'");
			rs = pst.executeQuery();
			if(rs.next()){
				loginJB.setMailid(rs.getString("gmail"));
				loginJB.setAccess(rs.getString("useracs"));
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
}
