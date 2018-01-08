<%
	String pno = request.getParameter("pno");
	String name = request.getParameter("name");
	String price = request.getParameter("price");
%>
pno = <% out.println(pno+"</br>");%>
name = <%out.println(name+"</br>");%>
price = <%out.println(price+"</br>");%>

<a href="product.html">Add New Product</a>