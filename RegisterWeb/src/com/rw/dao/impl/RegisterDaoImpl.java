package com.rw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rw.bean.Register;
import com.rw.dao.RegisterDao;
import com.rw.query.RegisterQuery;
import com.rw.utility.ConnectionManager;

public class RegisterDaoImpl implements RegisterDao {

	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	
	@Override
	public int registerAd(Register rg) {
		int count=0;
		try {
			con=	ConnectionManager.getConnection();
		ps=con.prepareStatement(RegisterQuery.INSERT_QUERY);
		ps.setString(1,rg.getUname());
		ps.setString(2,rg.getPass());
		ps.setString(3,rg.getEmail());
		ps.setInt(4,rg.getMobile());
		
		 count=ps.executeUpdate();
			return count;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.release(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			return count;
	}

	@Override
	public boolean login(String uname, String pass) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(RegisterQuery.SELECT_QUERY);
			ps.setString(1, uname);
			ps.setString(2, pass);
			rs=ps.executeQuery();
			if(rs.next()){
				flag=true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;

	
	}

	@Override
	public String forgotpass(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

}
