<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>
			<dl>
				<dt>NO</dt>
				<dd>${memberDto.no}</dd>
				<dt>ID</dt>
				<dd>${memberDto.id}</dd>
				<dt>NAME</dt>
				<dd>${memberDto.name}</dd>
				<dt>EMAIL</dt>
				<dd>${memberDto.email}</dd>
				<dt>PHONE</dt>
				<dd>${memberDto.phone}</dd>
				<dt>ZIPCODE</dt>
				<dd>${memberDto.zipCode}</dd>
				<dt>ADDRESS</dt>
				<dd>${memberDto.address}</dd>
				<dt>DATE</dt>
				<dd>${memberDto.regDate}</dd>
			</dl>
		</li>
	</ul>
</body>
</html>