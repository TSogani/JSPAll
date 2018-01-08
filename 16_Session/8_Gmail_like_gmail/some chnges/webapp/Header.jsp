<%@ page session="true"%>
		<%
		//HttpSession session=request.getSession(false);
		if(session != null){
		%>
		
		<a href="<%=response.encodeURL("Inbox.jsp")%>">Inbox</a> </t>
		<a href="<%=response.encodeURL("Send.jsp")%>">Send</a> </t>
		<a href="<%=response.encodeURL("Draft.jsp")%>">Draft</a> </t>
		<a href="<%=response.encodeURL("Spam.jsp")%>">Spam</a> </t>
		<a href="<%=response.encodeURL("Logout.jsp")%>">Logout </a> </t>

		
		<%
		}
		else{
		%>
		login first. Try Again.. <a href="Login.jsp">Login </a>
		<%
		}
		%>