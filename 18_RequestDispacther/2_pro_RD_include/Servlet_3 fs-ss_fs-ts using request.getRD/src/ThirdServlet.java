package info.inetsolv;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="ThirdServlet",urlPatterns="/xxx/yyy/zzz/ts")
public class ThirdServlet extends HttpServlet{
	
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
		
		out.println("we are in ThirdServlet");
	}
	
}
	