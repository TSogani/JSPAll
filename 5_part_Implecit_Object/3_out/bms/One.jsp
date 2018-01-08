<%
	out.println(request);
	out.println(request.getMethod()+"</br>");
	out.println("getContextPath"+request.getContextPath()+"</br>");
	out.println("getServletPath"+request.getServletPath()+"</br>");
	out.println("getRequestURI"+request.getRequestURI()+"</br>");
	out.println(request.getHeader("accept-language")+"</br>");


%>