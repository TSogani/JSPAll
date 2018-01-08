<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach var="a" begin="1" end="5">
		
		<c:out value="${a}"></c:out>
		
</c:forEach>
<%
int a  = (Integer)pageContext.getAttribute("a");
%>

${a}