<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="me" method="get">
	이름 : <input type="text" name="name" value="Park"><br>
	나이 : <input type="text" name="age" value="28"><br>
	<button type="submit">GET</button>
</form>
<form action="me" method="post">
	이름 : <input type="text" name="name" value="Jaeyoung"><br>
	사는곳 : <input type="text" name="home" value="Incheon"><br>
	<button type="submit">POST</button>
</form>
</body>
</html>