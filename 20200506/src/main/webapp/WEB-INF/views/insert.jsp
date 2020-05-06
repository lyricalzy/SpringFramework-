<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 가입한 정보 확인하는 화면. View-->
<h2>등록한 게시글 상세정보</h2>
<hr>
게시글 번호: ${bbsDTO.id }<br>
게시글 제목: ${bbsDTO.title }<br>
게시글 내용: ${bbsDTO.content }<br>
게시글 작성자: ${bbsDTO.writer }<br>
</body>
</html>