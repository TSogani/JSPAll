<%@ page import = "info.inetsolv.*"%>
<%
	Product p = new Product();
%>



<jsp:useBean id = "p1" class="info.inetsolv.Product"/>
<jsp:useBean id = "p2" class="info.inetsolv.Product" scope="page"/>
<jsp:useBean id = "p3" class="info.inetsolv.Product" scope="request"/>