
<%
	String name = "ravi";
	request.setAttribute("name",name);
%>



<%
	String n = (String)request.getAttribute("name");
%>
<%=n%>

try in Two.jsp 

null value get because  request object is removed after send the output by the browser so data is lost 

thats why we get null on two.jsp .

