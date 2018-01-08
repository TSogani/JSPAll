<%@ page session="false"%>

<%
	HttpSession session = request.getSession(false);
	out.println(session+"<br>");
	out.println(session.getId()+"<br>");
%>

