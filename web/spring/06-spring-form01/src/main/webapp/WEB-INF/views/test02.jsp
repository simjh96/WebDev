<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	div {margin-bottom:50px}
	form label span {display: inline-block; margin: 0 20px; width: 80px;}
	form div {margin-bottom: 10px}
</style>
<title>Insert title here</title>
</head>
<body>
	<h1>Form</h1>
	<div>
		<form:form modelAttribute="memberDto" method="POST" action="Result.do">
			<div><label><span>no: </span><form:input path="no"/></label></div>
		</form:form>
	</div>
</body>
</html>