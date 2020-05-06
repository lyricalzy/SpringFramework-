<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="select.do">
		검색할 id: <input type="text" name="id"> <input type="submit"
			value="회원 정보 검색">
	</form>
	<hr>
	<a href="select.do?id=park">park에 대한 회원 정보 검색</a>
	<hr>
	<a href="list.do">모든 회원 정보 검색</a>
</body>
</html>