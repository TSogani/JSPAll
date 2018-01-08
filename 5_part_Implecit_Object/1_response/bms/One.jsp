<%
		out.println(request);
		out.println(request.getProtocol());
		out.println(request.getMehtod());
		out.println(request.getRequestURI());
		out.println(request.getHeader("Accept-language"));
	
%>