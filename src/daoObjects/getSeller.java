package daoObjects;

import java.util.*;
import java.sql.*;

public class getSeller {
	private static ArrayList<String> sellerList;
	
	public static ArrayList<String> getSellerList(){
		sellerList = new ArrayList<String>();
		sellerList.clear();
		try{
			Connection con = dbConnect.getConnection();
			PreparedStatement pst = con.prepareStatement("select sellername from seller");
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				String s = rs.getString("sellername");
				sellerList.add(s);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return sellerList;
	}
}