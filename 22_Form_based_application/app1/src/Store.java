package info.inetsolv;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.*;

@WebServlet(name="Store",urlPatterns="/store")
public class Store extends HttpServlet{
	private boolean isStore=false;
	public void doGet(HttpServletRequest request,HttpServletResponse response){
		
		response.setContentType("text/html");
		PrintWriter out = null;
		
		try{
			out = response.getWriter();
		}catch(IOException ie){
			ie.printStackTrace();
		}
		try{
		int pid =  (Integer.parseInt(request.getParameter("pid")));
		String name = request.getParameter("name");
		Double price = (Double.parseDouble(request.getParameter("price")));
		
		Boolean isStore = insert(pid,name,price);
		if(isStore == true){
			out.println("the following details Stores :- <br>");
			out.println("pid is "+pid);
			out.println("pid is "+name);
			out.println("pid is "+price);
			out.print("<a href=Product.html>Add new Product..!!</a>");
		}else{
		out.print("Product not stored..! <a href=Product.html>try Again..!!</a>");
		}
	}catch(NumberFormatException ne){
		out.println("please Enter Valid data "+ne.getMessage());
		out.println("try again <a href=Product.html>try Again..!!</a>");
		}
	}	
	
	public boolean insert(int pid,String name,Double price){

		try{
			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hibernate","hibernate");
			
			String query="insert into product values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1,pid);
			pstmt.setString(2,name);
			pstmt.setDouble(3,price);
			
			pstmt.executeUpdate();
			isStore=true;
		}catch(SQLException sql){
			sql.printStackTrace();
		}
		return isStore;
	}
}