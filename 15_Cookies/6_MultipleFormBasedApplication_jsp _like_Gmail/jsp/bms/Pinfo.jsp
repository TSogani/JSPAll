<form action = "Ainfo.jsp">
<%
		String sno = request.getParameter("sno");
		String name = request.getParameter("name");
		
		Cookie csno = new Cookie("csno",sno);
		Cookie cname = new Cookie("cname",name);
		
		response.addCookie(csno);
		response.addCookie(cname);
		
%>

	<input type="text" name="fname" placeholder="enter father name"/><br/>
	<input type="text" name="mname" placeholder="enter mother name"/><br/>
	
	<input type="submit" value="Send"/>

	</form>