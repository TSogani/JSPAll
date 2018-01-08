
<%
	String n = (String)request.getAttribute("name");
	String n1 = (String)session.getAttribute("name");
	String n2 = (String)application.getAttribute("name");
%>
<%=n%></br>
<%=n1+"   from session"%></br>
<%=n2+"   from application"%></br></br>


multiple request and multiple resourse  go for session scope. 
and session specific to a brower.

ex. bus ticket availablity use session scope . for booking ticket 

use of application is dengers. because anyone can access.