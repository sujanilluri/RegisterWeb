package com.rw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rw.bean.Register;
import com.rw.dao.RegisterDao;
import com.rw.dao.impl.RegisterDaoImpl;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		int mobile=Integer.parseInt(request.getParameter("mobile"));
		
		PrintWriter pw=response.getWriter();
		
		Register rg=new Register(uname,pass,email,mobile);
		RegisterDao Impl=new RegisterDaoImpl();
		int count=Impl.registerAd(rg);
		if(count!=0)
		{
			pw.println("data inserted");
			pw.println("<a href=Login.html>HOME</a>");
			
		}
		else
			pw.println("not inserted");
		
	}

	

}
