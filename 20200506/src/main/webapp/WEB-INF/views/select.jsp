<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${writer}님이 로그인 중입니다.</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function() {
	$('button').click(function() {
		$.ajax({
			url: "add.do",
			data:{
				userid: ${dto.id},
				content: $('#content').val()
			},
			success: function(result) {
				$('div').append(result)
			}
		})
	})
})
</script>
</head>
<body>
<h2>게시글 상세 내용</h2>
<hr>
	게시글 번호: ${dto.id} <br>
	게시글 제목: ${dto.title} <br>
	게시글 내용: ${dto.content} <br>
	게시글 작성자: ${dto.writer} <br>
<hr>
댓글 번호 :<input type="text" id="id"><br>
댓글 내용: <input type="text" id="content"><br>
<button class="btn btn-success">댓글 작성</button>
<div style="background: gray;">
	<c:forEach items="${list2}" var="dto2">
		회원 평가: ${dto2.content}<br>
		<hr>
	</c:forEach>
</div>
</body>
</html>