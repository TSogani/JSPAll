<form action="Store.jsp" >

<%
		
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		
		
		session.setAttribute("fname",fname);
		session.setAttribute("mname",mname);
		
		
%>

	
		
	<input type="text" name="street" placeholder="enter street"/></br>
	<input type="text" name="city" placeholder="enter city"/></br>
	
	<input type="submit" value="send"/>

</form>