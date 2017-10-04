<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BIBLIOTECA LTV</title>
</head>
<body>
   <h3>Alterar Professor - ${professor.id}</h3>
	<form action="alterarProfessores" method="post">
	<table border="2">
	<tr>
		<td><input type="hidden" name="id" value="${professor.id}" /></td>
		<td><input type="hidden" name="matricula" value="${professor.matricula}" /></td> 
		<td><input type="hidden" name="nomeCompleto" value="${professor.nomeCompleto}" /></td> 
		<td><input type="submit" value="Alterar" /></td>
	</table>	
	</form>
</body>
</html>