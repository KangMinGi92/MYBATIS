<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<title>마이바티스 동적쿼리</title>
</head>
<body>
	<h3><a href="${path }/emp/empAll.do">전체사원 조회하기</a></h3>
	
	<h3>Data 연관관계설정하기</h3>
	<h4>
		<a href="${path }/emp/association.do">join으로 객체 가져오기</a>
	</h4>
	
	<h3>부서 조회하기</h3>
	<h4>
		<a href="${path }/selectDeptAll.do">전체부서 조회하기</a>
	</h4>
	
	<h3>다른 환경 접속하기</h3>
	<h4>
		<a href="${path }/member.do">회원 가져오기</a>
	</h4>
	
	<h3>게시판 가져오기</h3>
	<h4>
		<a href="${path }/board.do?no=31">게시글&댓글 전체출력, 작성자 이름, 이메일 출력</a>
	</h4>
</body>
</html>