<%@ page import="javax.servlet.*"%>
<%
		ServletContext context = getServletContext().getContext("/webapp1");
		out.println(context);
       RequestDispatcher rd = context.getRequestDispatcher("/Two.jsp");
       // RequestDispatcher rd = context.getRequestDispatcher("/Three.jsp");
		rd.forward(request, response);
%>

one.jsp webapp