<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/header.jsp" %>
	<main>
		<div class="container">
			<h2 class="subTitle">Join</h2>
			<div id="contents">
				<form method="POST" action="join_process.jsp" id ="join" class="form">
					<table>
						<colgroup>
							<col style="width:20%">
							<col style="width:80%">
						</colgroup>
						<tr>
							<th>id <span class="required">*</span></th> 
							<td><input type="text" name="user_id" placeholder="id"></td>
						</tr>
						<tr>
							<th>pw <span class="required">*</span></th> 
							<td><input type="password" name="user_pw" placeholder="pw"></td>
						</tr>
						<tr>
							<th>pw confirm <span class="required">*</span></th> 
							<td><input type="password" name="user_pw_confirm" placeholder="confirm"></td>
						</tr>
						<tr>
							<th>name <span class="required">*</span></th> 
							<td><input type="text" name="user_name" placeholder="name"></td>
						</tr>
						<tr>
							<th>address <span class="required">*</span></th> 
							<td>
								<div>
									<input type="number" name="user_zipcode" placeholder="우편번호">
									<button class="btn btnZipcode">zip</button>
								</div>
								<div class="addrBox">
									<input type="text" name="address01" placeholder="기본주소">
									<span>기본 주소</span>
								</div>
								<div class="addrBox">
									<input type="text" name="address02" placeholder="나머지주소">
									<span>나머지주소</span>
								</div>
							</td>
						</tr>
					</table>
				
					<div class="btns">
						<button type="submit" class="btn btnConfirm"> 회원가입</button>
						<button type="reset" class="btn btnCancle"> 취소</button>
					</div>
				</form>
			</div>
		</div>
	</main>
<%@ include file="./include/footer.jsp" %>