<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품번호 ${dto.id}번의 상세 정보페이지입니다.</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="../../top.jsp"></jsp:include>
	<div class="container">
		<h2>제품 상세 정보</h2>
		<hr>
		<table>
			<tr>
				<td width="100">제품 id:</td>
				<td width="200">${dto.id}</td>
			</tr>
			<tr>
				<td>제품명:</td>
				<td>${dto.name}</td>
			</tr>
			<tr>
				<td>가&nbsp;&nbsp;&nbsp;격:</td>
				<td>${dto.price}</td>
			</tr>
			<tr>
				<td>제조사:</td>
				<td>${dto.company}</td>
			</tr>
		</table>
		<hr>
		<button class="btn btn-primary"
			onclick="location.href='updating.jsp?id=${dto.id}&name=${dto.name}&price=${dto.price}&company=${dto.company}'">
			제품수정</button>
		<button class="btn btn-danger"
			onclick="location.href='delete.do?id=${dto.id}'">제품 삭제</button>
		<button class="btn btn-secondary" onclick="location.href='list.do?'">제품
			목록</button>
	</div>
	<jsp:include page="../../footer.jsp"></jsp:include>
</body>
</html>