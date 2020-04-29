<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>등록된 제품의 정보 보기</h3>
<hr>
<table border="1">
	<tr>
		<th>제품 아이디</th><th>제품 이름</th><th>제품 내용</th><th>제품 가격</th>
	</tr>
	<tr>
		<td>${productDTO.id}</td>
		<td>${productDTO.name}</td>
		<td>${productDTO.content}</td>
		<td>${productDTO.price}</td>
	</tr>
</table>
</body>
</html>