package info.inetsolv;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ProductServlet",urlPatterns="/store")
public class ProductServlet extends HttpServlet{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException{
		
			response.setContentType("text/html");
			PrintWriter out = null;
		
		try{
			out = response.getWriter();
		
			int pid =  (Integer.parseInt(request.getParameter("pid")));
			String name = request.getParameter("name");
			Double price = (Double.parseDouble(request.getParameter("price")));
			
			ProductJB pjb=new ProductJB();
			
			pjb.setPid(pid);
			pjb.setName(name);
			pjb.setPrice(price);
			
			Boolean isStore = pjb.storeData();
			
			if(isStore == true){
				
				request.setAttribute("pid",pid);
				request.setAttribute("name",name);
				request.setAttribute("price",price);
				
				RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
				rd.forward(request,response);
		
			}else{
			out.print("Product not stored..! <a href=Product.html>try Again..!!</a>");
			}
		}catch(NumberFormatException ne){
			out.println("please Enter Valid data "+ne.getMessage());
			out.println("try again <a href=Product.html>try Again..!!</a>");
		}
		catch(IOException ie){
				ie.printStackTrace();
			}
	}
}