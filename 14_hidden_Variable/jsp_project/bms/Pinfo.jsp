<form action = "Ainfo.jsp">
<%
		String sno = request.getParameter("sno");
		String name = request.getParameter("name");
%>

	<input type="text" name="fname" placeholder="enter father name"/><br/>
	<input type="text" name="mname" placeholder="enter mother name"/><br/>
	<input type = "hidden" name="hsno" value="<%=sno %>">
	<input type = "hidden" name="hname" value="<%=name %>">
	
	<input type="submit" value="Send"/>

	</form>