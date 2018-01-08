
<%


		String street = request.getParameter("street");
		String city = request.getParameter("city");
		
		
		Cookie cstreet = new Cookie("cstreet",street);
		Cookie ccity = new Cookie("ccity",city);
		
		response.addCookie(cstreet);
		response.addCookie(ccity);


			
	
%>




Following detail's Store :- 
</br>

			<%
			
			Cookie[] cookies = request.getCookies();

			
			for(Cookie c : cookies){
					
					out.println(c.getName()+" : "+c.getValue()+"<br>");
					
				}
				
			%>
 <%
	response.setHeader("Refresh","1");

 %>

 <a href="Sinfo.jsp">AddMoreRecords</a>