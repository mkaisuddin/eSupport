<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="http://localhost:8080/eSupport/style.css">
<title>Insert title here</title>
</head>
<body>
<form id="msform" action="/eSupport/Login.do">
	<fieldset>
		<h2 class="fs-title">Login Page</h2>
		User Name: <input type="text" name="email"/>
		Password : <input type="password" name="pass"/>
		<input type="submit" class="next action-button" value="Login" />
	</fieldset>
</form>
</body>
</html>