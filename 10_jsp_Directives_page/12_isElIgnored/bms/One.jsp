<%@ page isELIgnored="true"%>
<%
	application.setAttribute("uname","bms");
%>

<%
	String uname =(String) application.getAttribute("uname");
%>
uname : <%=uname %></br>

${uname}