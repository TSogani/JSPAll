
<%


		String street = request.getParameter("street");
		String city = request.getParameter("city");
		
		
		session.setAttribute("street",street);
		session.setAttribute("city",city);


			
	
%>




Following detail's Store :- 
</br>
			Sno : <%=session.getAttribute("sno")%>
			Name : <%=session.getAttribute("name")%>
			Fname : <%=session.getAttribute("fname")%>
			Mname : <%=session.getAttribute("mname")%>
			Street : <%=session.getAttribute("street")%>
			City : <%=session.getAttribute("city")%>

 <a href="Sinfo.jsp">AddMoreRecords</a>