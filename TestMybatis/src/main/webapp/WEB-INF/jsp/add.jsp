<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add page</title>
</head>
<body>

	<form action="addUser.do" method="post" >
		name:	<input type="text" name="name"><br>
		passwrod:<input type="password" name="password"><br>
		address:<input type="text" name="address"><br>
		age:<input type="text" name="age"><br>
		<input type="submit" value="提交"/>		
	</form>

</body>
</html>