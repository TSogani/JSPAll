<%
		
			int pid = (Integer)request.getAttribute("pid");
		//	String name =(String) request.getAttribute("name");
			double price = (Double)request.getAttribute("price");
		/*
			out.println("the following details Stores :- <br>");
			out.println("pid is "+pid);
			out.println("pid is "+name);
			out.println("pid is "+price);
			out.print("<a href=Product.html>Add new Product..!!</a>");
		*/	
%>
ELExpression 
<br>
${pid}<br>
${name}<br>
${price}<br>
<br><br><br><br>

ScopedVariable
<br><br>
<%=request.getAttribute("pid")%><br>
<%=request.getAttribute("name")%><br>
<%=request.getAttribute("price")%><br>