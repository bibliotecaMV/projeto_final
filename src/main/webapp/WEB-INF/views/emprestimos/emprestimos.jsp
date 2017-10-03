<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Empréstimos</title>
<meta charset="utf-8" />
<link rel="stylesheet" type="text/css"
	href="resources/css/emprestimos/emprestimos.css" />
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="resources/js/emprestimos/emprestimos.js"></script>
</head>
<body>
	<center>
		<h1>Empréstimos</h1>
	</center>
	<br>
	<br>
	<br>
	<div id="opcoes">
		<input type="text" name="pesquisa" size="40"
			placeholder="Nome do aluno ou professor"> <input type="radio"
			name="option" value="todos" checked>Todos <input type="radio"
			name="option" value="alunos">Alunos <input type="radio"
			name="option" value="professores">Professores <input
			type="checkbox" name="selection" value="devolvidos">Devolvidos
		<a href="listarEmprestimos"><input type="submit" value="Pesquisar"></a>
	</div>

	<br>
	<br>
	<table id="direito" border="1" width="700" height="100">
		<tr>
			<td>Id</td>
			<td>Livro</td>
			<td>Aluno</td>
			<td>Professor</td>
			<td>Turma</td>
			<td>Data do Empréstimo</td>
			<td>Data da Devolução</td>
			<td>Devolver</td>
		</tr>
		<c:forEach var="emprestimos" items="${emprestimos}">
			<tr>
				<td><center>${emprestimos.id}</center></td>
				<td><center>${emprestimos.livro.tombo}</center></td>

				<c:if test="${emprestimos.aluno.nome == null }">
					<td>Vazio</td>
				</c:if>
				<c:if test="${emprestimos.aluno.nome != null }">
					<td><center>${emprestimos.aluno.nome}</center></td>
				</c:if>
				<c:if test="${emprestimos.professor.nome == null }">
					<td>Vazio</td>
				</c:if>
				<c:if test="${emprestimos.professor.nome != null }">
					<td><center>${emprestimos.professor.nome}</center></td>
				</c:if>
				<c:if test="${emprestimos.turma.nome == null }">
					<td>Vazio</td>
				</c:if>
				<c:if test="${emprestimos.turma.nome != null }">
					<td><center>${emprestimos.turma.nome}</center></td>
				</c:if>
				<td><center>${emprestimos.dataEmprestimo}</center></td>
				<c:if test="${emprestimos.dataDevolucao == null}">
					<td id="campo_devolucao_${emprestimos.id}">Não devolvido</td>
				</c:if>
				<c:if test="${emprestimos.dataDevolucao != null}">
					<td id="campo_devolucao_${emprestimos.id}">${emprestimos.dataDevolucao}</td>
				</c:if>
				<c:if test="${emprestimos.dataDevolucao == null}">
					<td id="emprestimo_${emprestimos.id}"><a href="#"
						onClick="realizarDevolucao(${emprestimos.id});"> Devolver
							Agora </a></td>
				</c:if>
				<c:if test="${emprestimos.dataDevolucao != null}">
					<td>Devolvido</td>
				</c:if>
			</tr>
		</c:forEach>
	</table>
	<div id="escolha">
		<input type="radio" name="radio" onclick="habilitarAlunos();" checked>Aluno
		<input type="radio" name="radio" onclick="habilitarProfessores();">Professor
	</div>
	<form action="realizarEmprestimos" method="POST" name="formulario">
		<table id="esquerda">
			<tr>
				<td>Tombo:</td>
				<td><input type="text" name="tombo" id="tombo" /></td>
			</tr>
			<tr>
				<td>Turma:</td>
				<td><select name="nome_turma" id="turma">
						<option selected>Selecione</option>
						<c:forEach items="${turmas}" var="turmas">
							<option>${turmas.nome}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>Aluno:</td>
				<td><select name="nome_aluno" id="aluno">
						<option selected>Selecione</option>
						<c:forEach items="${alunos}" var="alunos">
							<option>${alunos.nome}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>Professor:</td>
				<td><select  name="nome_professor" id="professor" disabled>
						<option selected>Selecione</option>
						<c:forEach items="${professores}" var="professores">
							<option>${professores.nome}</option>
						</c:forEach>
				</select></td>
			</tr>
		</table><br>
		<input type="submit" value="Realizar Empréstimo" id="enviar"/>
	</form>

</body>
</html>