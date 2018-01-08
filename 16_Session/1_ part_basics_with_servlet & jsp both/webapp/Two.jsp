<%@ page session="false"%>
<%
		out.println(session+"<br>");
		out.println(session.getId()+"<br>");
		out.println(session.isNew());
%>