<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="JSTL Core 라이브러리"></c:out>
	<br>
	<c:forEach begin="1" end="10" step="1" var="i">
		<%-- ${ i} --%>
		<c:out value="${i }"></c:out>
	</c:forEach>
</body>
</html>