<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="css/reset.css" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&family=PT+Serif:wght@400;700&family=Raleway:wght@100;200;300;400;500;600;700;800;900&family=Titillium+Web:wght@200;300;400;600;700;900&display=swap"
	rel="stylesheet" />

<link rel="stylesheet" href="css/layout.css" />
<link rel="stylesheet" href="css/form.css" />
<script src="../js/jquery-3.6.0.min.js"></script>
</head>
<body>
	<header>
		<div class="inner">
			<h1>GALLERY</h1>
		</div>
	</header>
	<form class="form" action="InsertProcess.do"
		enctype="multipart/form-data" method="POST">
		<table>
			<colgroup>
				<col style="width: 20%;">
				<col>
			</colgroup>
			<tbody>
				<tr>
					<th>제목</th>
					<td><input type="text"  placeholder="title insert" name="title">
						<div class="category">
							<label><input type="checkbox" name="category" value="travel"><span>travel</span></label>
							<label><input type="checkbox" name="category" value="movie"><span>movie</span></label>
							<label><input type="checkbox" name="category" value="study"><span>study</span></label>
							<label> <input type="checkbox" name="category" value="life"> <span>life</span></label>
						</div></td>
				</tr>
				<tr>
					<th>contents</th>
					<td><textarea name="contents"></textarea></td>
				</tr>
				<tr>
					<th>file</th>
					<td><input type="file" name="multipartFile"></td>
				</tr>
			</tbody>
		</table>
		<div class="btns">
			<button type="submit" class="btn btnConfirm">submit</button>
			<button type="reset" class="btn btnCancel">cancel</button>
		</div>
	</form>

</body>
</html>