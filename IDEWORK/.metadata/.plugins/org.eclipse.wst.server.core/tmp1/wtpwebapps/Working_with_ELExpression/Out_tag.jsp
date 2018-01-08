<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<c:set scope="request" var="no1" value="20" />
--
<c:out value="${requestScope.no1}" />
--
<c:remove var="no1"/>

<c:out value="${no1}" />

${no1}


<input type="text" name="id"/>
<input type="text" name="name"/>

${param.id}
${param.name}

<c:param name="id"/>
      
<c:url var="myurl" value="Out_tag.jsp"></c:url>

<c:set var="no" value="10"/>
<c:if test="${no<20 }">
	inside If 
</c:if>

</body>
</html>