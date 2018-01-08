<jsp:useBean id = "p" class="info.inetsolv.Product"/>


	<%=pageContext.getAttribute("name") %> null
	<%=pageContext.getAttribute("p") %>	
	<%=pageContext.getAttribute("p").getClass().getName() %>