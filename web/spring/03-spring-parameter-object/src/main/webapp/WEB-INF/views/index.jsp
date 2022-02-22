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
	<ul>
		<li><a href="ParameterObject01.do?data01=10&data02=20&data03=30&data03=40">ParameterObject01.do</a></li>
		<li><a href="ParameterObject02.do?data01=10&data02=20&data03=30&data03=40">ParameterObject02.do</a></li>
	</ul>
	
	<form action="ParameterObject03.do">
		<legend>Member</legend>
		<div><label><span>no</span><input name="no"></label></div>
		<div><label><span>id</span><input name="id"></label></div>
		<div><label><span>name</span><input name="name"></label></div>
		<div><label><span>password</span><input name="password"></label></div>
		<div><label><span>extraArg</span><input name="extraArg"></label></div>
		<button>send</button>
	</form>
	<form method="POST" action="ParameterObject04.do">
		<legend>Board</legend>
		<div><label><span>no</span><input name="no"></label></div>
		<div><label><span>subject</span><input name="subject"></label></div>
		<div><label><span>password</span><input name="password"></label></div>
		<div><label><span>regDate</span><input name="regDate"></label></div>
		<div><label><span>hit</span><input name="hit"></label></div>
		<button>send</button>
	</form>
</body>
</html>