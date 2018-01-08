package info.inetsolv;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="SendCookies", urlPatterns="/sendCookie")
public class SendCookies extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response){
			Cookie c1 = new Cookie("city","jaipur");
			Cookie c2 = new Cookie("state","Rajasthan");
			response.addCookie(c1);
			response.addCookie(c2);
			System.out.println("Cookie added successfully");
	}	
}