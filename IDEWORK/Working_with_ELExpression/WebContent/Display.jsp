<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="p" class="com.beans.MyClass"/>
<jsp:setProperty property="id" name="p" value="12"/>
<jsp:setProperty property="name" name="p" value="tanuj"/>

${p}
${"dsa" }
${p.getId()}
${p.getName() }
</body>
</html>