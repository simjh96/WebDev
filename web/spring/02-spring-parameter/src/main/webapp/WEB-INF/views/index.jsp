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
		<li><a href="Parameter01.do?data01=10&data02=20&data03=30">parameter01</a></li>
		<li><a href="Parameter02.do?data01=10&data02=20&data03=30&data03=40">parameter01</a></li>
		<li><a href="parameter/01">parameter</a></li>
	</ul>
	
	<form method="GET" action="Parameter04.do">
		<div><label><span>data01</span><input type="text" name="data01"></label></div>
		<div><label><span>data02</span><input type="text" name="data02"></label></div>
		<div>
			<label><span>data03-30</span><input type="checkbox" name="data03" value=30></label>
			<label><span>data03-40</span><input type="checkbox" name="data03" value=40></label>
		</div>
		<button>Parameter04.do로 전송</button>
	</form>
</body>
</html>