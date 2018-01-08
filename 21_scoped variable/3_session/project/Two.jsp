
<%
	String n = (String)request.getAttribute("name");
	String n1 = (String)session.getAttribute("name");
%>
<%=n%>
<%=n1+"   from session"%>


multiple request and multiple resourse  go for session scope. 

ex. bus ticket availablity use session scope . for booking ticket 