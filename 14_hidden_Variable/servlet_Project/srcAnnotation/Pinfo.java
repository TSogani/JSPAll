package info.inetsolv;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet(name="Pinfo",urlPatterns="/Pinfo")
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
		
		String sno = request.getParameter("sno");
		String name = request.getParameter("name");

		out.println("<input type=\"text\" name=\"fname\" placeholder=\"enter father name\"/><br/>");
		out.println("<input type=\"text\" name=\"mname\" placeholder=\"enter mother name\"/><br/>");		
		out.println("<input type = \"hidden\" name=\"hsno\" value="+sno+">");
		out.println("<input type = \"hidden\" name=\"hname\" value="+name+">");
		out.println("<input type=\"submit\" value=\"Send\"/>");
		out.println("</form>");
	

	


	}
	
}