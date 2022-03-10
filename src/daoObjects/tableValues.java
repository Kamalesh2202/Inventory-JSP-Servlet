package daoObjects;
import vaoObjects.Stocks;
import java.util.*;
import java.sql.*;

public class tableValues {
	private static ArrayList<Stocks> stk;
	
	public static ArrayList<Stocks> getStocks(){
		stk = new ArrayList<Stocks>();
		stk.clear();
		try{
			Connection con = dbConnect.getConnection();
			PreparedStatement pst = con.prepareStatement("select s.stkid,s.stkname,s.quantity,p.rate from stocks s inner join purchase_det p on p.stkid = s.stkid");
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				Stocks st = new Stocks();
				st.setProductId(rs.getString("stkid"));
				//System.out.print(rs.getString("stkid") + "    ");
				st.setProductName(rs.getString("stkname"));
				//System.out.print(rs.getString("stkname") + "    ");
				st.setQuantity(rs.getInt("quantity"));
				//System.out.print(rs.getInt("quantity") + "    ");
				st.setRate(rs.getFloat("rate"));
				//System.out.println(rs.getFloat("rate"));
				stk.add(st);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return stk;
	}
}
