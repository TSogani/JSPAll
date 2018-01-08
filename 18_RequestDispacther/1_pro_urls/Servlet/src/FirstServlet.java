package info.inetsolv;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="FirstServlet",urlPatterns="/xxx/fs")
public class FirstServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");

		
		PrintWriter out = null;
		try{
			out = response.getWriter();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		
		out.println("we are in FirstServlet");
		out.println("getRequestURI"+request.getRequestURI());
		out.println("getRequestURL"+request.getRequestURL());
		out.println("getServletPath"+request.getServletPath());
		out.println("getContextPath"+request.getContextPath());
	}
	
}
