<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 전체 목록</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<script>
	//이전 버튼 이벤트
	function fn_prev(page, range, rangeSize) {
		var page = ((range - 2) * rangeSize) + 1;
		var range = range - 1;
		var url = "list.do";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
	//페이지 번호 클릭
	function fn_pagination(page, range, rangeSize, searchType, keyword) {
		var url = "list.do";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
	//다음 버튼 이벤트
	function fn_next(page, range, rangeSize) {
		var page = parseInt((range * rangeSize)) + 1;
		var range = parseInt(range) + 1;
		var url = "list.do";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		location.href = url;
	}
</script>

</head>
<body>
	<jsp:include page="../../top.jsp"></jsp:include>
	<div class="container" align="center">
		<h2>제품 전체 목록</h2>
		<hr>
		<table class="tabel table-hover" border="1">
			<tr>
				<th width="100">제품 id</th>
				<th width="600">제품 명</th>
				<th width="200">가격</th>
			</tr>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.id}</td>
					<td><a href="select.do?id=${dto.id}">${dto.name}</a></td>
					<td>${dto.price}원</td>
				</tr>
			</c:forEach>
		</table>
		<div class="container" align="center"
			style="margin-left: 350px; margin-top: 100px;">
			<!-- pagination{s} -->
			<ul class="pagination">
				<c:if test="${page.prev}">
					<li class="page-item"><a class="page-link" href="#"
						onClick="fn_prev('${page.page}', '${page.range}', '${page.rangeSize}')">Previous</a></li>
				</c:if>
				<c:forEach begin="${page.startPage}" end="${page.endPage}" var="idx">
					<li
						class="page-item <c:out value="${page.page == idx ? 'active' : ''}"/> "><a
						class="page-link" href="#"
						onClick="fn_pagination('${idx}', '${page.range}', '${page.rangeSize}')">
							${idx} </a></li>
				</c:forEach>
				<c:if test="${page.next}">
					<li class="page-item"><a class="page-link" href="#"
						onClick="fn_next('${page.range}', '${page.range}', '${page.rangeSize}')">Next</a></li>
				</c:if>
			</ul>
			<!-- pagination{e} -->
		</div>
	</div>
	<jsp:include page="../../footer.jsp"></jsp:include>
</body>
</html>