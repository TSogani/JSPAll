<%
	out.println(pageContext);
	out.println(pageContext.getPage()+"</br>");
	out.println(pageContext.getOut()+"</br>");
	out.println(pageContext.getRequest()+"</br>");
	out.println(pageContext.getResponse()+"</br>");
	out.println(pageContext.getSession()+"</br>");
	out.println(pageContext.getException()+"</br>");
	out.println(pageContext.getServletContext()+"</br>");
	out.println(pageContext.getServletConfig()+"</br>");
	 
	
%>