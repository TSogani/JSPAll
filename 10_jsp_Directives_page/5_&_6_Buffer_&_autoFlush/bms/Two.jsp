<%@ page buffer="500kb" %>
<%@ page autoFlush="false" %>



<%
	
	for(int i=0;i<20000;i++){
		out.println(" i value is :"+i+"</br>");
	}

%>

// buffer is over flow. 