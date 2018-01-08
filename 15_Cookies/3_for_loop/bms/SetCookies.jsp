<%

	for(int i=0;i<200;i++)
		{
			Cookie i = new Cookie("No : "+i,i);
			response.addCookie(i);
		}

%>
