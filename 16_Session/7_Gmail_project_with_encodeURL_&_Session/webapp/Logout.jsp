<%@ page session="false"%>

	<%
		HttpSession session=request.getSession(false);
		if(session != null){
		session.invalidate();
	%>

		Logout Successfullly..!!
		Try Again.. <a href="Login.jsp">Login </a>
	
			<%
		}
		else{
		%>
		login first. Try Again.. <a href="Login.jsp">Login </a>
		<%
		}
		%>