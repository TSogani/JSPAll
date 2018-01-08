<%@ page import="java.sql.*"%>
<%
	try
	{
	
		int no = Integer.parseInt(request.getParameter("no"));
		String name =request.getParameter("name");
		Double salary= Double.parseDouble(request.getParameter("salary"));
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","abc");
		String query="insert into Employee values(?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1,no);
		pstmt.setString(2,name);
		pstmt.setDouble(3,salary);	
		int n =	pstmt.executeUpdate();
		
		out.println(n);
		out.println("record inserted");
	}catch(Exception e){
		e.printStackTrace();
	}	
%>
<a href="Employee.jsp">Add More Record</a>