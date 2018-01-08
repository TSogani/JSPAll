package info.inetsolv;

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="FirstServlet",urlPatterns="/xxx/fs")
public class FirstServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		response.addHeader("cache-control","no-cache,no-store");

		
		PrintWriter out = null;
		try{
			out = response.getWriter();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		out.println("first Servler Before");
//		RequestDispatcher rd = request.getRequestDispatcher("../../../../One.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/One.jsp");
		rd.include(request,response);
		out.println("first Servler After");
		
		}
	
}
