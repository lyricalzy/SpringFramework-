<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제 완료</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="../../top.jsp"></jsp:include>
<div class="container">
<h2>삭제된 제품</h2>
<hr>
	제품 ${dto.id}번 삭제 완료 <br>
<hr>
<button class="btn btn-secondary" onclick="location.href='list.do?'">제품 목록</button>
</div>
<jsp:include page="../../footer.jsp"></jsp:include>
</body>
</html>
