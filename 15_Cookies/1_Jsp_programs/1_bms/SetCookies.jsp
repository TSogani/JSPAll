<%
	Cookie c1 = new Cookie("uname","ravi");
	Cookie c2 = new Cookie("pwd","abc");
	response.addCookie(c1);
	response.addCookie(c2);
%>