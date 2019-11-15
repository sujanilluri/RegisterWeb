package com.rw.dao;

import com.rw.bean.Register;


public interface RegisterDao {
	public int registerAd(Register rg);
	public boolean login(String uname,String pass);
	public String forgotpass(String uname);

}
