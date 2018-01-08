package info.inetsolv;

import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet(name="TestServlet",urlPatterns="/ts")
public class TestServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response){
	
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");
		HttpSession session = request.getSession(true);
		System.out.println(session);
		System.out.println(session.getId());
		System.out.println(session.isNew());
	}
}