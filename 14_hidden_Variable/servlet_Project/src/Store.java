package info.inetsolv;

import javax.servlet.http.*;
import java.io.*;
public class Store extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");
		
		PrintWriter out=null;
			try{
				out = response.getWriter();
			}catch(IOException ie){
				ie.printStackTrace();
			}

			String sno = request.getParameter("hsno");
			String sname = request.getParameter("hname");
			String fname = request.getParameter("hfname");
			String mname = request.getParameter("hmname");
			String street = request.getParameter("street");
			String city = request.getParameter("city");

			
		out.println("Following detail's Store :- </br>");


		out.println(sno+"<br>");
		out.println(sname+"<br>");
		out.println(fname+"<br>");
		out.println(mname+"<br>");
		out.println(street+"<br>");
		out.println(city+"<br>");
		
		
		out.println(" <a href=\"Sinfo\">AddMoreRecords</a>");
	


	}
	
}