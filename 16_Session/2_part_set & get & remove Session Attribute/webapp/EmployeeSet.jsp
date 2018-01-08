<%@ page import="info.inetsolve.*"%>
<%
	Employee e = new Employee();
	e.setSno(11);
	e.setName("ravi");
	
	session.setAttribute("e",e);
%>