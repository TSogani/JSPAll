<%
	int a = 5;
	int b = 6;
	info.inetsolv.Cone c = new info.inetsolv.Cone();
		
		c.setEno(15);
		c.setName("ravi");
	
	
%>

<%
	out.println(a);
	out.println(b);
	out.println(c);
	out.println(c.getEno());
	out.println(c.getName());
	out.println(a<b);


%>

-----------------------------------------------
<br>
<%= c.getEno()%></br>
<%= c.getName()%></br>
	