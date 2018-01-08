
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
<%
	String Uname=null;
	String password=null;
	Cookie[] c = request.getCookies();
	for(Cookie c1 : c){
		if(c1.getName().equals("uname")){
			Uname=c1.getValue();
		}
		if(c1.getName().equals("pwd")){
			password=c1.getValue();
		}
	}
%>
 <a href="Sinfo.jsp?uname=<%=Uname %>&pwd=<%=password %> "> AddMoreRecords</a>
 