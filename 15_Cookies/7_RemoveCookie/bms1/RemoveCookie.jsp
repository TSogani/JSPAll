<%
			
			Cookie[] cookies = request.getCookies();
			
			for(Cookie c : cookies)
			{
				out.println(c+"<br>");
				
					c.setMaxAge(0);
                 response.addCookie(c);
				out.println(c.getName());
				out.println(c.getValue());
			

			}

			
%>
------------------------------------
<br>
<%
			for(Cookie c : cookies)
			{
				out.println(c+"<br>");
				out.println(c.getName());
				out.println(c.getValue());
			

			}

%>