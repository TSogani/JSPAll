
<%
	String name = "ravi";
	application.setAttribute("name",name);
%>



<%
	String n = (String)application.getAttribute("name");
%><br>
<%=n%><br>

try in Two.jsp <br>
try in Three.jsp 
<br>


multiple request and multiple resourse  go for session scope. <br>
and session specific to a brower.<br>

ex. bus ticket availablity use session scope . for booking ticket <br>

use of application is dengers. because anyone can access.<br>