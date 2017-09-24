<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>
			Fazer Login
		</title>
		<meta charset="utf-8" />
	</head>
	<body>
		<h2>Login:</h2>
		<form action="verificarLoginMonitor" method="post">
			<table>
				<tr>
					<td>Usuario:</td>
					<td>Senha:</td>
				</tr>
				<tr>
					<td><input type="text" name="usuario" /></td>
					<td><input type="password" name="senha" /></td>
				</tr>
			</table>
			<input type="submit" value="Logar" /> 
		</form>
	</body>
</html>