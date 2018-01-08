package info.inetsolv;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name="LoginCheckServlet", urlPatterns="/logincheck")
public class LoginCheckServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");
		PrintWriter out =null ;
		try{
		out = response.getWriter();
		}catch(IOException ie){
			ie.printStackTrace();
		}
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		
		if(uname.equals("login") && pwd.equals("login")){
			
			out.println("<a href=\"Inbox\">Inbox</a></br>");
			out.println("<a href=\"Send\">Send</a></br>");
			out.println("<a href=\"Draft\">Draft</a></br>");
			out.println("<a href=\"Spam\">Spam</a></br>");
			out.println("<a href=\"Trash\">Trash</a></br>");
			out.println("<a href=\"Login.html\">Logout</a></br>");	
			out.println("login Successfuly");
		}
		else{
			out.println("invalid UserName / password.<a href=\"Login.html\"> Try Again..!! </a>");
		}
	}
}