<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>디렉티브 태그</title>
</head>
<body>
	<%! 
	int pageCount = 0;
	void addCount(){
		pageCount++;
	}
	%>
	
	<% addCount();%>
	<p>
		이 사이트 방문은 <%= pageCount %>
	</p>
</body>
</html>