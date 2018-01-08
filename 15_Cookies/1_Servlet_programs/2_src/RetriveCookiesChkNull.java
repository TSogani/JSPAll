package info.inetsolv;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="RetriveCookiesChkNull", urlPatterns="/retriveCookiechknull")
public class RetriveCookiesChkNull extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response){
			
			PrintWriter out = null;
			try{
				out = response.getWriter();
			}catch(IOException io){
			
			}
			Cookie[] cookies = request.getCookies();
			if(cookies != null){
			
				for(Cookie c : cookies)
				{
					out.println(c);
					
					out.println(c.getName()+" : "+c.getValue());

				}
			}else
			{
				out.println("Record Not available");
			}
	}	
}