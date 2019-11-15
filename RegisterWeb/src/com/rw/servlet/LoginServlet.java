package com.rw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname =request.getParameter("uname");
		String pass=request.getParameter("pass");
		PrintWriter pw=response.getWriter();
		RequestDispatcher rd=null;
		ServletContext sc = getServletContext();
		
		if (uname.equals("sujan")&&pass.equals("sujan"))
		{
			rd=sc.getRequestDispatcher("/sucess.html");
			rd.forward(request, response);
			
			
			}
		else{
			pw.println("invalid credentials");
			rd=request.getRequestDispatcher("loginservlet");
		}
		
		
		
		
		
	}

}
