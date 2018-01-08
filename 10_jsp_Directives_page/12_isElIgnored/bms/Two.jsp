<%@ page isELIgnored="false"%>
<%
	application.setAttribute("uname","bms");
%>

<%
	String uname =(String) application.getAttribute("uname");
%>
uname : <%=uname %></br>


${uname}