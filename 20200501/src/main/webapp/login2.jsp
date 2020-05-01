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
	$('button').click(function() {
		$.ajax({
			url: "check.do",
			data: {
				id: $('#id').val(),
				pw: $('#pw').val()
			},
			success: function(result) {
				// views 아래에 있는 jsp파일의 실행결과를 받아온다.
				$('div').append(result+"<br>")
			}
		})
	})
})
</script>
</head>
<body>
아이디 입력: <input type="text" name="id" id="id"><br>
비밀번호 입력: <input type="text" name="pw" id="pw"><br>
<button>로그인 처리</button>
<hr>
<div></div>
</body>
</html>