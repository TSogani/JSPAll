<%
			
			Cookie[] cookies = request.getCookies();
			
			if(cookies != null)
			{
				for(Cookie c : cookies)
				{
					out.println(c+"<br>");
					
					out.println(c.getComment());
					out.println(c.getDomain());
					out.println(c.getMaxAge());
					out.println(c.getName());
					out.println(c.getValue());
					out.println(c.getPath());
					out.println(c.getSecure());
					out.println(c.getVersion());
					out.println(c.isHttpOnly());

				}
			}
			else{
				out.println("record not available");
			}
%>