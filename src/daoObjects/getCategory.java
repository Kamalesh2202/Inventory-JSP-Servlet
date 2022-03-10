package daoObjects;

import java.util.*;
import java.sql.*;

public class getCategory {
	private static ArrayList<String> categoryList;
	
	public static ArrayList<String> getCategoryList(){
		categoryList = new ArrayList<String>();
		categoryList.clear();
		try{
			Connection con = dbConnect.getConnection();
			PreparedStatement pst = con.prepareStatement("select category from category");
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				String s = rs.getString("category");
				categoryList.add(s);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return categoryList;
	}
}
