<%!
	
		JspWriter out;
	int a;
	public void methodOne() throws java.io.IOException{
		out.println("from method one");
	}
%>	
<%
	this.out=out;
	methodOne();
%>