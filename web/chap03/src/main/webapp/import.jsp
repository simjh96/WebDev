<%@page import="java.text.SimpleDateFormat"%>
<%@ page import = "java.util.Calendar" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat today = new SimpleDateFormat("yyyy-mm-dd");
	SimpleDateFormat now = new SimpleDateFormat("hh : mm : ss");
	%>
	<p><%= now.format(calendar.getTime()) %></p>
</body>
</html>