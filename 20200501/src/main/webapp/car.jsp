<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/car.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function() {
	$("#text").click(function() {
		$.ajax({
			url: "text.mega",
			data: {
				text: $("#data").val(),
			},
			success: function(result) {
				$('div').append(result)
			}
		})
	})
	$("#img").click(function() {
		$.ajax({
			url: "img.mega",
			success: function(result) {
				$('div').append(result)
			}
		})
	})
})
</script>
</head>
<body>
데이터:<input type="text" id="data"><br>
<button id="text">텍스트 추가</button>
<button id="img">이미지 추가</button>
<hr>
<div></div>
</body>
</html>
