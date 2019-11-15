package com.rw.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionManager {
	private static Connection con=null;
	//user defined method
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver registred with DriverManager");
//Step 2: Establish Connection with Database S/w			
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
System.out.println("Connection Interface Implementation Class :"+con);
if(con!=null)
System.out.println("Connection is established");
else
System.out.println("Connection is not established");
		
		return con;
	}
	
	
	public static void release(Connection con,PreparedStatement ps) throws SQLException
	{
		if(ps!=null)
			ps.close();
		if(con!=null)
			con.close();
	}
	
	public static void release(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException
	{
		if(rs!=null)
			rs.close();
		if(ps!=null)
			ps.close();
		if(con!=null)
			con.close();
	}

}
