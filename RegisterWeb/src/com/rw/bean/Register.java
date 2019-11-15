package com.rw.bean;

public class Register {
	private String uname;
	private String pass;
	private String email;
	private int mobile;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String uname, String pass, String email, int mobile) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.email = email;
		this.mobile = mobile;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	
	

}
