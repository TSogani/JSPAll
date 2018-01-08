one.jsp
jsp
</br>
<%
	RequestDispatcher rd = request.getRequestDispatcher("Two.jsp");
	rd.include(request,response);
%>
</br>

after