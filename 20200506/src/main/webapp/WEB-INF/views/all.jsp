<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="dto" items="${list2}">
댓글 내용: ${dto.content}<br>
댓글 작성자: ${dto.writer}<br>
</c:forEach>