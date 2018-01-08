
<%
	String name = "ravi";
	request.setAttribute("name",name);
%>

<%
	String n = (String)request.getAttribute("name");
%>

<%=n +"___"%>   from reqOne

<%
	RequestDispatcher rd = request.getRequestDispatcher("reqTwo.jsp");
	rd.include(request,response);
%>

