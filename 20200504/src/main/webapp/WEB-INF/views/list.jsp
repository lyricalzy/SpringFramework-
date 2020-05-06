<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Java코드 필요: html태그 -->
<c:forEach items="${list}" var="dto">
	검색된 id: <a href="select.do?id=${dto.id}">${dto.id}</a> <br>
	검색된 pw: ${dto.pw} <br>
	검색된 name: ${dto.name} <br>
	검색된 tel: ${dto.tel} <br>
	<hr>
</c:forEach>
</body>
</html>