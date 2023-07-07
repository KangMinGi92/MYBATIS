<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<title>게시판 출력하기</title>
</head>
<body>
	<table class="table table-striped">
		<tr>
			<th>게시판 번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>이메일</th>
		</tr>
		<c:if test="${not empty boards }">
			<c:forEach var="b" items="${boards }">
				<tr>
					<td>${b.boardNo }</td>
					<td>${b.boardTitle }</td>
					<td>${b.members.username }</td>
					<td>${b.boardDate }</td>
					<td>${b.members.email }</td>
				</tr>
				<tr>
					<td colspan="5">${b.boardContent }</td>
				</tr>
					<td colspan="5"><hr></td>
				<tr>
					<td></td>
					<td><b>댓글번호</b></td>
					<td><b>내용</b></td>
					<td><b>작성자</b></td>
					<th><b>작성일</b></th>
				</tr>
				<c:forEach var="c" items="${b.comments }">
					<tr>
						<td></td>
						<td>${c.boardCommentNo }</td>
						<td>${c.boardCommentContent }</td>
						<td>${c.boardCommentWriter}</td>
						<td>${c.boardCommentDate }</td>
					</tr>
				</c:forEach>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>