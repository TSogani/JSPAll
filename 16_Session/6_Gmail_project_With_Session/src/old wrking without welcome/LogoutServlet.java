package info.inetsolv;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name="LogoutServlet", urlPatterns="/Logout")
public class LogoutServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");
		HttpSession session = request.getSession(false);
		
		PrintWriter out =null;
		
		
		try{
		out = response.getWriter();
		}catch(IOException ie){
			ie.printStackTrace();
		}
		if(session != null){
				session.invalidate();
					out.println("Logout Successfully..!!  <a href=\"Login.jsp\">Login_Again..!!</a></br>");
		}else{
			out.println("please Login first : <a href=\"Login.jsp\">Login</a>");
		}
		
	}
}