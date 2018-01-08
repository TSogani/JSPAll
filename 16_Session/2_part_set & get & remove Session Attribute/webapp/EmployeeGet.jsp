<%@ page import="info.inetsolve.*"%>
<%
	Object o = session.getAttribute("e");
	Employee e = (Employee)o;
	
%>
	sno = <%=e.getSno()%>
	name = <%=e.getName()%>