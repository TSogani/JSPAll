<%@ page session="true"%>
		<%
		//HttpSession session=request.getSession(false);
		if(session != null){
		%>
			<p align="left">
		<a href="<%=response.encodeURL("Inbox.jsp")%>">Inbox</a> </br>
		<a href="<%=response.encodeURL("Send.jsp")%>">Send</a> </br>
		<a href="<%=response.encodeURL("Draft.jsp")%>">Draft</a> </br>
		<a href="<%=response.encodeURL("Spam.jsp")%>">Spam</a> </br>
		<a href="<%=response.encodeURL("Logout.jsp")%>">Logout </a> </br>
	</p>
		
		<%
		}
		else{
		%>
		login first. Try Again.. <a href="Login.jsp">Login </a>
		<%
		}
		%>