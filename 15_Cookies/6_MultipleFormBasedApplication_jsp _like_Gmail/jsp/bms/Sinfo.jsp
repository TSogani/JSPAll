
<%
	String uname= request.getParameter("uname");
	String pwd = request.getParameter("pwd");
	String true = request.getParameter("true");
	
	
	
	if(uname.equals("bms") && pwd.equals("abc")){
		
		if(true == null){
%>

			<form action = "Pinfo.jsp">

				<input type = "text" name="sno" placeholder="enter sno"/><br>
				<input type = "text" name="name" placeholder="enter name"/><br>
				<input type = "submit" value="send" /><br>
			
			</form>

<%
		}
		else{
			Cookie uname1 = new Cookie("uname",uname);
			Cookie pwd1 = new Cookie("pwd",pwd);
				uname1.setMaxAge(100);
				pwd1.setMaxAge(100);
			response.addCookie(uname1);
			response.addCookie(pwd1);
	
		%>
		
			<form action = "Pinfo.jsp">

				<input type = "text" name="sno" placeholder="enter sno"/><br>
				<input type = "text" name="name" placeholder="enter name"/><br>
				<input type = "submit" value="send" /><br>
			
			</form>
		
		<%
	}
	}	
	else{
		out.println("Enter UserName Password </br>");
		out.println("try Again..! ");
%>
		 <a href="Login.jsp">Login Again</a>
<%		
	}
%>