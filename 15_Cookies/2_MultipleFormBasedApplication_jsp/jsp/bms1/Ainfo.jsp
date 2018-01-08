<form action="Store.jsp" >

<%
		
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		
		
		Cookie cfname = new Cookie("cfname",fname);
		Cookie cmname = new Cookie("cmname",mname);
		
		response.addCookie(cfname);
		response.addCookie(cmname);
		
		
%>

	
		
	<input type="text" name="street" placeholder="enter street"/></br>
	<input type="text" name="city" placeholder="enter city"/></br>
	
	<input type="submit" value="send"/>

</form>