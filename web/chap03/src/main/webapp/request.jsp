<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>context path: <%= request.getContextPath() %></li>
		<li>request method: <%= request.getMethod() %></li>
		<li>RequestURL: <%= request.getRequestURL() %></li>
		<li>RequestURI: <%= request.getRequestURI() %></li>
		<li>ServerName: <%= request.getServerName() %></li>
		<li>Protocol: <%= request.getProtocol() %></li>
	</ul>
</body>
</html>