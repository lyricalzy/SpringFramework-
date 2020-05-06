<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${dto.id}님의 검색 결과</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function() {
	$('button').click(function() {
		$.ajax({
			url: "add.do",
			data:{
				id: $('#id').val(),
				userid: "${dto.id}",
				content: $('#content').val()
			},
			success: function(result) {
				location.reload()
			}
		})
	})
})
</script>
</head>
<body>
	검색된 id: ${dto.id} <br>
	검색된 pw: ${dto.pw} <br>
	검색된 name: ${dto.name} <br>
	검색된 tel: ${dto.tel} <br>
<hr>
회원 평가 번호 :<input type="text" id="id"><br>
회원 평가 :<input type="text" id="content"><br>
<button class="btn btn-success">댓글 작성</button>
<div style="background: gray;">
	<c:forEach items="${list2}" var="dto2">
		회원평가: ${dto2.content}<br>
		작성일: ${dto2.writedate}<br>
		<hr>
	</c:forEach>
</div>
</body>
</html>