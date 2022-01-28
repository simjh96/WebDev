<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <main>
      <div class="container">
	      <h2 class="subTitle">JOIN</h2>
		  <div id="contents">
		  	<!-- 데이터 받아서 처리하기....forward방식으로 데이터 보여주기....  -->
		  	<form method="POST" action="notice_process.jsp" id="notice" class="form">
		  		<table>
		  			<colgroup>
		  				<col style="width:20%">
		  				<col style="width:80%">
		  			</colgroup>
		  			<tbody>
		  				<tr>
		  					<th>contents <span class="required">*</span></th>
		  					<td><textarea rows="" cols=""></textarea></td>
		  				</tr>
		  			</tbody>
		  		</table>
		  		<div class="btns">
		  			<button type="submit" class="btn btnConfirm">회원가입</button>
		  			<button type="reset" class="btn btnCancel">취소</button>
		  		</div>
		  	</form>
		  </div>      	
	  </div>
    </main>


<%@ include file="./include/footer.jsp"%>
