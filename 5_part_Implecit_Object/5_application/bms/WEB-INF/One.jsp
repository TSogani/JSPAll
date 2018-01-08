first line
Second line

<% 
	out.println(application+"</br>");
	out.println(application.getInitParameter("drv")+"</br>");
	out.println(application.getInitParameter("dbname")+"</br>");
	out.println(application.getInitParameter("dbpwd")+"</br>");
	
	out.println(application.getMajorVersion()+"</br>");
	out.println(application.getMinorVersion()+"</br>");

%>


