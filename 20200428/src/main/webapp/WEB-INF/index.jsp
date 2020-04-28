<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	오늘은 화요일입니다.!!!
	<hr>
	<a href="hi.do">하이 페이지 호출.</a>
	<br>
	<a href="Hello?id=root">Hello.java 호출(GET요청)</a>
	<br>
	<form action="Hello" method="post">
		<input type="text" name="id" value="admin">
		<button type="submit">Hello.java 호출(POST요청)</button>
	</form>
</body>
</html>