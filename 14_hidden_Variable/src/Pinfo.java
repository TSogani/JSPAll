package info.inetsolv;

import javax.servlet.http.*;
import java.io.*;
public class Pinfo extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");
		
		PrintWriter out=null;
			try{
				out = response.getWriter();
			}catch(IOException ie){
				ie.printStackTrace();
			}
			
		out.println("<form action=\"Ainfo\" >");
		out.println("<input type=\"text\" name=\"fname\" placeholder=\"enter father name\"/><br/>");
		out.println("<input type=\"text\" name=\"mname\" placeholder=\"enter mother name\"/><br/>");
		out.println("<input type=\"submit\" value=\"Send\"/>");
		out.println("</form>");
	

	


	}
	
}