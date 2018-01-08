<%


		String street = request.getParameter("street");
		String city = request.getParameter("city");
		
		
		Cookie cstreet = new Cookie("cstreet",street);
		Cookie ccity = new Cookie("ccity",city);
		
		response.addCookie(cstreet);
		response.addCookie(ccity);

			Cookie[] cookies = request.getCookies();
			
	
	
%>

Following detail's Store :- 
</br>

			<%
			
				for(Cookie c : cookies){
					out.println(c.getName()+" : "+c.getValue()+"<br>");
				}
				
			%>
 
 
 <a href="Sinfo.jsp">AddMoreRecords</a>