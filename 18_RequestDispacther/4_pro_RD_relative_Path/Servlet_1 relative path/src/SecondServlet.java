package info.inetsolv;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="SecondServlet",urlPatterns="/xxx/yyy/ss")
public class SecondServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");

		
		PrintWriter out = null;
		try{
			out = response.getWriter();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}	
																// |-xxx
																	// |-fs
																	// |-yyy
																		// |-ss
																		// |zzz
																			// |-ts
																// ..	/../..	/fs
																// ..	/../fs
			out.println("we are in SecondServlet");
			//ServletContext application = getServletContext();
			RequestDispatcher rd = request.getRequestDispatcher("zzz/ts");
			out.println("</br>");
			out.println("getRequestURI"+request.getRequestURI());
			out.println("</br>");
		out.println("getRequestURL"+request.getRequestURL());
		out.println("</br>");
		out.println("getServletPath"+request.getServletPath());
		out.println("</br>");
		out.println("getContextPath"+request.getContextPath());
		out.println("</br>");
		out.println(" 	getPathInfo()"+request.getPathInfo());
	
			rd.include(request,response);	
			out.println("we are in SecondServlet end ");
	
	}
	
}
