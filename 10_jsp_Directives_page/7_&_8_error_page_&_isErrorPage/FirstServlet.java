
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try{
		
		Class.forName("test");
		}
		catch(ClassNotFoundException e){
			error.jsp
		}
	}
}