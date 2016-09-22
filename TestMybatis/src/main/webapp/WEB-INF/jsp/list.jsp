
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="" method="post">
		<table border="1px" cellspacing="0">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>age</th>
				<th>address</th>
				<th>password</th>
			</tr>
			<c:forEach items="${list}" var ="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.name}</td>
					<td>${u.age}</td>
					<td>${u.address}</td>
					<td>${u.password}</td>
				</tr>
			</c:forEach>
		</table>
	</form>

</body>
</html>