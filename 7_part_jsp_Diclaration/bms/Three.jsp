<%!
	int a;
	public void methodOne(JspWriter out) throws java.io.IOException{
		out.println("from method one");
	}
%>	
<%
	methodOne(out);
%>