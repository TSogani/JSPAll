package info.inetsolv;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet(name="Ainfo",urlPatterns="/Ainfo")
public class Ainfo extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");
		
		PrintWriter out=null;
			try{
				out = response.getWriter();
			}catch(IOException ie){
				ie.printStackTrace();
			}
			
		
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		
		
		Cookie cfname = new Cookie("cfname",fname);
		Cookie cmname = new Cookie("cmname",mname);
		
		response.addCookie(cfname);
		response.addCookie(cmname);
			
		out.println("<form action=\"Store\" >");
		out.println("<input type=\"text\" name=\"street\" placeholder=\"enter street\"/></br>");
		out.println("<input type=\"text\" name=\"city\" placeholder=\"enter city\"/></br>");
		
		out.println("<input type=\"submit\" value=\"send\"/>");
		out.println("</form>");
	


	}
	
}