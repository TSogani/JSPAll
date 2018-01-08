

<%
	HttpSession session = request.getSession(false);
	out.println(session+"<br>");
	out.println(session.getId()+"<br>");
%>
// because session bydefault true. 
use old session object. 