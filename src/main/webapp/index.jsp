<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<script type= "text/JavaScript">
		function Hello() {
			alert('hello world!');
		}
		function EventHandler() {
			alert('Im event handler');
		}
	</script>

</head>
<body>
	<h1>Hello World!</h1>
	<h1>The time on the server is <%= new java.util.Date() %></h1>
	Is 75 less then 69? <%= 75<69 %>
	<input type="button" onclick="Hello();" name="ok" values="click me"/>

	<p onmouseover="EventHandler();">Bring your mouse here to see alert</p>
	<c:if test="${not empty param.name}">
		<p>Name: ${param.name}</p>
	</c:if>
</body>
</html>
