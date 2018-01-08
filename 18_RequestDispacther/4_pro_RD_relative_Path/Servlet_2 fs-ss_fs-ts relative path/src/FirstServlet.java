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
			
		//	ServletContext application = getServletContext();
			
			RequestDispatcher rd = request.getRequestDispatcher("yyy/ss");
			rd.include(request,response);
			
			out.println("we are in FirstServlet after");
			
			
			out.println("we are in FirstServlet end");

	}
}