<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty employees }">
		<table  class="table table-striped">
			<tr>
				<th>사원번호</th>
				<th>직원명</th>
				<th>주민등록번호</th>
				<th>이메일</th>
				<th>전화번호</th>
				<th>부서명</th>
				<th>직급명</th>
				<th>급여등급</th>
				<th>급여</th>
				<th>보너스율</th>
				<th>관리자사번</th>
				<th>입사일</th>
				<th>퇴사일</th>
				<th>퇴사여부</th>
				<th>성별</th>
			</tr>
		<c:forEach var="e" items="${employees }" >
			<tr>
				<td>${e.empId }</td>
				<td>${e.empName }</td>
				<td>${e.empNo }</td>
				<td>${e.email }</td>
				<td>${e.phone }</td>
				<td>
					<ul>
						<li>${e.dept.deptId }</li>
						<li>${e.dept.deptTitle }</li>
						<li>${e.dept.locationId }</li>
					</ul>
				</td>
				<td>${e.jobCode }</td>
				<td>${e.salLevel }</td>
				<td><fmt:formatNumber value="${e.salary }" type="currency" />원</td>
				<td><fmt:formatNumber value="${e.bonus }" type="percent" /></td>
				<td><c:out value="${e.managerId }" /></td>
				<td><fmt:formatDate value="${e.hireDate }"
						pattern="yyyy-MM-dd" /></td>
				<td><fmt:formatDate value="${e.entDate }"
						pattern="yyyy-MM-dd" /></td>
				<td><c:out value="${e.entYn }" /></td>
				<td>${e.gender=='F'?"여":"남" }</td>
			</tr>
		</c:forEach>
		</table>
	</c:if>
</body>
</html>