<%!
	String name = "ravi";
	int age = 24;
	String city = "Jaipur";
%>
<%
	session.setAttribute("name", name);
	session.setAttribute("age",age);
	session.setAttribute("city",city);
%>