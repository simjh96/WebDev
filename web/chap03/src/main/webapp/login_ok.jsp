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
		request.setCharacterEncoding("UTF-8");
		String db_id = "심재훈";
		String db_name = "심재훈1";
		String db_pw = "1234";
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		if (user_id.equals(db_id) && user_pw.equals(db_pw)) {
			response.sendRedirect("login_success.jsp?user_name="+db_name);
		} else {
			out.println("<script>alert('아이디 또는 비밀번호가 맞지 않습니다'); history.back()</script>");
		}
	%>

</body>
</html>