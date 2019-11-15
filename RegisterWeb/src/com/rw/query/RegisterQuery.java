package com.rw.query;

public interface RegisterQuery {
	String INSERT_QUERY="insert into Register (uname,pass,email,mobile) values(?,?,?,?)";
	String SELECT_QUERY="select * from Register where uname=? and pass=?";
}
