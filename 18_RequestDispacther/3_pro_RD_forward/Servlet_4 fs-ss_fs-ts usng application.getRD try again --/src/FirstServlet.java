package info.inetsolv;
	
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="FirstServlet",urlPatterns="/xxx/fs")
public class FirstServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");

		
		PrintWriter out = null;
		try{
			out = response.getWriter();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
			out.println("we are in FirstServlet before ");
			
			ServletContext application = getServletContext();
			
			RequestDispatcher rd1 = application.getRequestDispatcher("/xxx/yyy/ss");
			rd1.forward(request,response);
			
			out.println("we are in FirstServlet after");
			
			out.println("second....");
			
			RequestDispatcher rd2 = application.getRequestDispatcher("/xxx/yyy/zzz/ts");
			rd2.forward(request,response);			

			out.println("we are in FirstServlet end");

	}
}