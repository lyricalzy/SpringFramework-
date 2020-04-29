<%@page import="com.mega.mvc04.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<!-- 가입한 정보 확인하는 화면. View-->
	<h2>당신의 가입 정보</h2>
	<hr>
	<ul>
		<li>당신의 id: ${memberDTO.id }</li>
		<li>당신의 pw: ${memberDTO.pw }</li>
		<li>당신의 name: ${memberDTO.name }</li>
		<li>당신의 tel: ${memberDTO.tel }</li>
	</ul>
</body>
</html>