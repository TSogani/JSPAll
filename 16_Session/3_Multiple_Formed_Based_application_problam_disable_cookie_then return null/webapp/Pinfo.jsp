<form action = "Ainfo.jsp">
<%
		String sno = request.getParameter("sno");
		String name = request.getParameter("name");

		session.setAttribute("sno",sno);
		session.setAttribute("name",name);
%>

	<input type="text" name="fname" placeholder="enter father name"/><br/>
	<input type="text" name="mname" placeholder="enter mother name"/><br/>
	
	<input type="submit" value="Send"/>

	</form>