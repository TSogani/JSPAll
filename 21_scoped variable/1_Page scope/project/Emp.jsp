<%@ page import="info.inetsolv.*"%>
<%
	Employee e = new Employee();
	
	e.setNo(10);
	e.setName("fgfh");
	
	int no = e.getNo();
	String name = e.getName();
	
	pageContext.setAttribute("no",no);
	pageContext.setAttribute("name",name);
%>

<%
	int no1 = (Integer)pageContext.getAttribute("no");
	String name1 = (String)pageContext.getAttribute("name");
%>

<%=no1%></br>
<%=name1%>