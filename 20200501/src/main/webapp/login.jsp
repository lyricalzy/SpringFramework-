<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function() {
	alert("로그인 처리 시작합니다.")
})
</script>
</head>
<body>
<form action="check.do">
아이디 입력: <input type="text" name="id"><br>
비밀번호 입력: <input type="text" name="pw"><br>
<button>로그인 처리</button>
</form>
</body>
</html>