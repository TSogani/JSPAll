<form action="Store.jsp" >

<%
		String sno = request.getParameter("hsno");
		String name = request.getParameter("hname");
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
%>

	<input type ="hidden" name="hsno" value="<%=sno%>">
	<input type ="hidden" name="hname" value="<%=name%>">
	<input type ="hidden" name="hfname" value="<%=fname%>">
	<input type ="hidden" name="hmname" value="<%=mname%>">
		
	<input type="text" name="street" placeholder="enter street"/></br>
	<input type="text" name="city" placeholder="enter city"/></br>
	
	<input type="submit" value="send"/>

</form>