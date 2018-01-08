package info.inetsolv;

import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(name="Sinfo",urlPatterns="/Sinfo")
public class Sinfo extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");
		
		PrintWriter out=null;
			try{
				out = response.getWriter();
			}catch(IOException ie){
				ie.printStackTrace();
			}
			
		out.println("<form action =\"Pinfo\">");
		out.println("<input type = \"text\" name=\"sno\" placeholder=\"enter sno\"/><br>");
		out.println("<input type = \"text\" name=\"name\" placeholder=\"enter name\"/><br>");
		out.println("<input type = \"submit\" value=\"send\" /><br>");
		out.println("</form>");
	



	


	}
	
}