first line
Second line
<%
			
String drv = config.getInitParameter("drv");  
String dbname=config.getInitParameter("dbname");
String dbpwd=config.getInitParameter("dbpwd");
String servletname=config.getServletName();

%>
<%

	out.println(drv);
	out.println(dbname);
	out.println(dbpwd);

	out.println(servletname);
	
%>
