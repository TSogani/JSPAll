package info.inetsolv;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet(name="InboxServlet", urlPatterns="/Inbox")
public class InboxServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");
		PrintWriter out =null;
		try{
		out = response.getWriter();
		}catch(IOException ie){
			ie.printStackTrace();
		}
			
		out.println("\t \t \t we are in  Inbox Mail Detail's </br>\t \t \t");
		
			out.println("<a href=\"Inbox\">Inbox</a></br>");
			out.println("<a href=\"Send\">Send</a></br>");
			out.println("<a href=\"Draft\">Draft</a></br>");
			out.println("<a href=\"Spam\">Spam</a></br>");
			out.println("<a href=\"Trash\">Trash</a></br>");
		out.println("<a href=\"Login.html\">Logout</a></br>");
			
	}
}