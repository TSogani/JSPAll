package info.inetsolv;

import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
@WebServlet(name="Store",urlPatterns="/Store")
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

		String street = request.getParameter("street");
		String city = request.getParameter("city");
		
		
		Cookie cstreet = new Cookie("cstreet",street);
		Cookie ccity = new Cookie("ccity",city);
		
		response.addCookie(cstreet);
		response.addCookie(ccity);

			Cookie[] cookies = request.getCookies();

			
		out.println("Following detail's Store :- </br>");

				for(Cookie c : cookies){
					out.println(c.getName()+" : "+c.getValue()+"<br>");
				}
		
		out.println(" <a href=\"Sinfo\">AddMoreRecords</a>");
	


	}
	
}