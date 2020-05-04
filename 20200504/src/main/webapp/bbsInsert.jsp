<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시글 작성</h3>
<hr>
<form action="insert.do">
게시글 번호 입력: <input type="text" name="id"><br>
게시글 제목 입력: <input type="text" name="title"><br>
게시글 내용 입력: <input type="text" name="content"><br>
게시글 작성자 입력: <input type="text" name="writer"><br>
<button>게시글 작성 처리</button>
</form>
</body>
</html>