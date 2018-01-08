<%
	RequestDispatcher rd = request.getRequestDispatcher("Two.jsp");
	String asd = rd.FORWARD_PATH_INFO;
%>
	<%=asd %>
<%
	rd.include(request,response);
%>
