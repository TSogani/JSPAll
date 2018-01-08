<%
			String sno = request.getParameter("hsno");
			String sname = request.getParameter("hname");
			String fname = request.getParameter("hfname");
			String mname = request.getParameter("hmname");
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