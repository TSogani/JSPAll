<%@ page session="false"%>

<%
	String uname=request.getParameter("uname");
	String pwd = request.getParameter("pwd");
%>
<%
	if(uname.equalsIgnoreCase("login") && pwd.equalsIgnoreCase("login")){
	HttpSession session=request.getSession(true);
%>

		<a href="<%=response.encodeURL("Inbox.jsp")%>">Inbox</a> </br>
		<a href="<%=response.encodeURL("Send.jsp")%>">Send</a> </br>
		<a href="<%=response.encodeURL("Draft.jsp")%>">Draft</a> </br>
		<a href="<%=response.encodeURL("Spam.jsp")%>">Spam</a> </br>
	<a href="<%=response.encodeURL("Logout.jsp")%>">Logout </a> </br>
	
<%	
	}
	else{
		%>
		login failed. Try Again.. <a href="Login.jsp">Login </a>
<%
	}
%>