<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 완료</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="../../top.jsp"></jsp:include>
<div class="container">
<h2>수정된 제품 정보</h2>
<hr>
<table>
	<tr>
		<td width="100">제품 id:</td><td width="200">${dto.id}</td>
	</tr>
	<tr>
		<td>제품명:</td><td>${dto.name}</td>
	</tr>
	<tr>
		<td>가&nbsp;&nbsp;&nbsp;격:</td><td>${dto.price}</td>
	</tr>
	<tr>
		<td>제조사:</td><td>${dto.company}</td>
	</tr>
</table>
<hr>
<button class="btn btn-secondary" onclick="location.href='list.do'">제품 목록</button>
</div>
<jsp:include page="../../footer.jsp"></jsp:include>
</body>
</html>