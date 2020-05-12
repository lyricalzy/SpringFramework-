<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품번호 ${dto.id}번의 정보 수정페이지입니다.</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="top.jsp"></jsp:include>
<div class="container">
<h2>제품 정보 수정</h2>
<hr>
<form action="update.do">
<table>
	<tr>
		<td width="100">제품 id:</td><td width="200"><input type="text" name="id" value="${param.id}"></td>
	</tr>
	<tr>
		<td>제품명:</td><td><input type="text" name="name" value="${param.name}"></td>
	</tr>
	<tr>
		<td>가&nbsp;&nbsp;&nbsp;격:</td><td><input type="text" name="price" value="${param.price}"></td>
	</tr>
	<tr>
		<td>제조사:</td><td><input type="text" name="company" value="${param.company}"></td>
	</tr>
</table>
<button class="btn btn-primary" type="submit">제품 수정</button>
</form>
<hr>
<button class="btn btn-secondary" onclick="location.href='list.do'">제품 목록</button>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>