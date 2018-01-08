package info.inetsolv;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="RetriveCookies", urlPatterns="/retriveCookie")
public class RetriveCookies extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response){
			
			PrintWriter out = null;
			try{
				out = response.getWriter();
			}catch(IOException io){
			
			}
			Cookie[] cookies = request.getCookies();
			
			for(Cookie c : cookies)
			{
				out.println(c+"<br>");
				
				out.println(c.getComment());
				out.println(c.getDomain());
				out.println(c.getMaxAge());
				out.println(c.getName());
				out.println(c.getValue());
				out.println(c.getPath());
				out.println(c.getSecure());
				out.println(c.getVersion());
				out.println(c.isHttpOnly());

			}
			
	}	
}