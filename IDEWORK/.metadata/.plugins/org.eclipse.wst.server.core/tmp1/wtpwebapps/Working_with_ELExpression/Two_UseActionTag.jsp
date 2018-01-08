<%@page import="com.beans.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="employee" class="com.beans.Employee"/>

<jsp:useBean id="address" class="com.beans.Address"/>





<jsp:setProperty name="employee" property="no" value="1234"/>
<jsp:setProperty name="employee" property="name" value="tanuj" />
<jsp:setProperty name="employee" property="salary" value="15000"/>
<jsp:setProperty property="address" name="employee" value="${address }"/>

${employee.no } <br>
${employee.name } <br>
${employee.salary } <br>




<jsp:setProperty name="address" property="street" value="street"/>
<jsp:setProperty name="address" property="city" value="jaipur"/>
<jsp:setProperty name="address" property="state" value="state"/>

${employee.address.city } <br>
${employee.address.state } <br>
${employee.address.city}	

</body>
</html>
