<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Spring</h1>
	<img src="images/layout/spring_logo.png">
	<form method="POST" action="Test01.do">
	<div><label><span>data01</span><input name="data01"></label></div>
	<div><label><span>data02</span><input name="data02"></label></div>
	<button>submit</button>
	</form>
	<form method="POST" action="MemberTest.do">
	<div><label><span>no</span><input name="no"></label></div>
	<button>submit</button>
	</form>
</body>
</html>