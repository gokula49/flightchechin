<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create location</title>
</head>
<body>
	<form action="updateLoc" method="post">
	<pre>
		Id: <input type="text" name="id" value="${location.id}" readonly="true"/> 
		Code: <input type="text" name="code" value="${location.code}"/> 
		Name: <input type="text" name="name" value="${location.name}"/> 
		Type: Urban  <input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/>
		 Rural <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/> 
		<input type="submit" value="save"/>
    </pre>
	</form> 

</body>
</html>