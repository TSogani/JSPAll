
<%
session.removeAttribute("age"); 
%>
name : - <%=session.getAttribute("name") %>
age : - <%=session.getAttribute("age") %>
city : - <%=session.getAttribute("city") %>