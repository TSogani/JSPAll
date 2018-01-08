<%
	String sno = request.getParameter("sno");
	String sname = request.getParameter("sname");
	String fname = request.getParameter("fname");
	String mname = request.getParameter("mname");
	String street = request.getParameter("street");
	String city = request.getParameter("city");

	
	
%>

Following detail's Store :- 
</br>

 sno : <%=sno %> <br>
 sname : <%= sname %> <br>
 fname : <%=fname %><br>
 mname : <%= mname %><br>
 street : <%=street %><br>
 city : <%=city %><br>
 
 
 <a href="Sinfo.html">AddMoreRecords</a>