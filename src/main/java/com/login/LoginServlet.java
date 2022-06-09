package com.login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/login", "/login/" })

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }
    
    @Override
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body><form method=\"post\" action=\"login\">"
				+ "<input type=\"text\" name=\"username\" placeholder=\"Login\" /><br/>" 
				+ "<input type=\"password\" name=\"password\" placeholder=\"Password\"/><br/>"
				+ "<input type=\"submit\" value=\"Sign in\" /><br/>"
				+ "<form>");
		out.print( "<p> Login: user, Password: 12345</p>" +
				"</body></html>");
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
    	String pass=request.getParameter("password");
    	
   
    	if(name.equals("user") && pass.equals("12345")){  
    		PrintWriter out = response.getWriter();
			  
			out.print("Welcome " + name + "!");
			out.flush();

        }  else {
        	PrintWriter out = response.getWriter();
			out.print("Something went wrong. Please reload the page");
			out.flush();
        }

	}

}
