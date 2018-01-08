<%
	String name = "ravi";
	pageContext.setAttribute("name",name);
%>



<%
	String n = (String)pageContext.getAttribute("name");
%>
<%=n%>