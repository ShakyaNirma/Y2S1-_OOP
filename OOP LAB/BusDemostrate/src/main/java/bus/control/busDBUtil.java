package bus.control;
import bus.control.Bus; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;


public class busDBUtil {
	
	public static List<Bus> validate(int busid){
	
		ArrayList<Bus> bus=new ArrayList<>();
		//create database connection
		String url="jdbc:mysql://localhost:3306/busswap";
		String user="root";
		String pass="shaki9996";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stat=con.createStatement();
			String sql="select * from bus where BusId ='"+busid+"'";
			ResultSet rs=stat.executeQuery(sql);
			
			if (rs.next()) {
				int id=rs.getInt(1);
				int seatno=rs.getInt(2);
				String owner=rs.getString(3);
				String driverid=rs.getString(4);	
				
				Bus b = new Bus(id, seatno, owner, driverid);

				bus.add(b);
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return bus;
	}
}
