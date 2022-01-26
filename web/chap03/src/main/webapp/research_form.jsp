<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="research_ok.jsp">
	<table border="1" width="600px">
	<tr>
		<th>이름</th>
		<td> <input type="text" name="user_name" placeholder="d"> </td>
	</tr>
	<tr>
		<th>성별</th>
		<td> <input type="radio" name="gender" value="male"> 남자</td>
		<td> <input type="radio" name="gender" value="female"> 여자</td>
	</tr>

	</table>
	<button>전송</button>
	<button type="reset">취소</button>
	</form>
</body>
</html>