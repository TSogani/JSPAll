package info.inetsolv;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="ThirdServlet",urlPatterns="/xxx/yyy/zzz/ts")
public class ThirdServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");

		
		PrintWriter out = null;
		try{
			out = response.getWriter();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		
		out.println("we are in ThirdServlet");
			//ServletContext application = getServletContext(); //  /xxx/yyy/zzz/ts
			RequestDispatcher rd = request.getRequestDispatcher("../../fs");
			out.println("getRequestURI"+request.getRequestURI());
		out.println("getRequestURL"+request.getRequestURL());
		out.println("getServletPath"+request.getServletPath());
		out.println("getContextPath"+request.getContextPath());
	
			rd.include(request,response);	
			out.println("we are in ThirdServlet after");
	}
}


