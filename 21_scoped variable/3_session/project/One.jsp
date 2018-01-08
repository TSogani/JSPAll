
<%
	String name = "ravi";
	session.setAttribute("name",name);
%>



<%
	String n = (String)session.getAttribute("name");
%>
<%=n%>

try in Two.jsp 
try in Three.jsp 
