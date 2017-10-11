<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BIBLIOTECA LTV - MV INFORMATICA</title>

<!-- Bootstrap -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="resources/css/style.css">
</head>
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="resources/js/emprestimos/emprestimos.js"></script>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand">Painel do Administrador</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<button type="submit" class="btn btn-warning">
						<a href="logoutAdministrador" class="link">Encerrar a sessão</a>
					</button>
				</form>
			</div>
		</div>
	</nav>



	<div class="container">
		<div id="content">
			<div class="row">

				<div class="panel panel-warning">
					<div class="panel-heading">
						<h3 class="panel-title">Empréstimos</h3>
					</div>
					<div class="panel-body">
						<div id="escolha">
							<div class="col-sm-3">
								<input type="radio" name="radio"
									onclick="habilitarAlunosAdicionar();" checked>Aluno
							</div>
							<div class="col-sm-3">
								<input type="radio" name="radio"
									onclick="habilitarProfessoresAdicionar();">Professor
							</div>
						</div>
					</div>


					<form class="form-horizontal" action="realizarEmprestimos"
						method="POST" name="formulario">
						<div class="form-group">
							<label for="tombo1" class="col-sm-2 control-label">Tombo:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="tombo1"
									name="tombo1" required />
							</div>
						</div>

						<div class="form-group">
							<label for="turma1" class="col-sm-2 control-label">Turma:</label>
							<div class="col-sm-3">
								<select class="form-control" name="turma1" id="turma1">
									<option selected>Selecione</option>
									<c:forEach items="${turmas}" var="turma">
										<option>${turma.nome}</option>
									</c:forEach>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label for="aluno1" class="col-sm-2 control-label">Aluno:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="aluno1"
									name="aluno1" required />
							</div>
						</div>

						<div class="form-group">
							<label for="professor1" class="col-sm-2 control-label">Professor:</label>
							<div class="col-sm-3">
								<select class="form-control" name="professor1" id="professor1"
									disabled>
									<option selected>Selecione</option>
									<c:forEach items="${professores}" var="professor">
										<option>${professor.nome}</option>
									</c:forEach>
								</select>
							</div>
						</div>

						<div class="modal-footer">
							<button type="reset" class="btn btn-danger">Limpar</button>
							<button type="submit" class="btn btn-warning">Realizar
								Empréstimo</button>
						</div>

					</form>
				</div>


				<hr>

				<div class="panel panel-warning">
					<div class="panel-heading">
						<h3 class="panel-title">Empréstimos 22</h3>
					</div>
					<div class="panel-body">
						<form name="formulario2" action="listarEmprestimosDaTable"
							method="post">
							<div>
								<c:if test="${opcoesMarcadas == '1'}">
									<input type="radio" name="option" value="todos"
										onclick="desabilitarAlunosProfessoresListar();" checked>Todos
									
								<input type="radio" name="option" value="alunos"
										onclick="habilitarAlunosListar();">Alunos 
									
									<select name="turma2" id="turma2" disabled>
										<option>Turma:</option>
										<c:forEach items="${turmas}" var="turma">
											<option>${turma.nome}</option>
										</c:forEach>
									</select>

									<input type="text" name="aluno2" id="aluno2" disabled>

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();">Professores 
									
									<select name="professor2" id="professor2" disabled>
										<option>Professor:</option>
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos"
										checked>Devolvidos
									
									<input type="submit" value="Pesquisar">
								</c:if>

								<c:if test="${opcoesMarcadas == '2'}">
									<input type="radio" name="option" value="todos"
										onclick="desabilitarAlunosProfessoresListar();" checked>Todos
					
				<input type="radio" name="option" value="alunos"
										onclick="habilitarAlunosListar();">Alunos 
					
					<select name="turma2" id="turma2" disabled>
										<option>Turma:</option>
										<c:forEach items="${turmas}" var="turma">
											<option>${turma.nome}</option>
										</c:forEach>
									</select>

									<input type="text" name="aluno2" id="aluno2" disabled>

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();">Professores 
					
					<select name="professor2" id="professor2" disabled>
										<option>Professor:</option>
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos">Devolvidos
					
					<input type="submit" value="Pesquisar">
								</c:if>
								<c:if test="${opcoesMarcadas == '3'}">
									<input type="radio" name="option" value="todos"
										onclick="desabilitarAlunosProfessoresListar();">Todos
					
				<input type="radio" name="option" value="alunos"
										onclick="habilitarAlunosListar();" checked>Alunos 
					
					<select name="turma2" id="turma2">
										<option>Turma:</option>
										<c:forEach items="${turmas}" var="turma">
											<option>${turma.nome}</option>
										</c:forEach>
									</select>

									<input type="text" name="aluno2" id="aluno2">

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();">Professores 
					
					<select name="professor2" id="professor2" disabled>
										<option>Professor:</option>
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos"
										checked>Devolvidos
					
					<input type="submit" value="Pesquisar">
								</c:if>
								<c:if test="${opcoesMarcadas == '4'}">
									<input type="radio" name="option" value="todos"
										onclick="desabilitarAlunosProfessoresListar();">Todos
							
						<input type="radio" name="option" value="alunos"
										onclick="habilitarAlunosListar();" checked>Alunos 
							
							<select name="turma2" id="turma2">
										<option>Turma:</option>
										<c:forEach items="${turmas}" var="turma">
											<option>${turma.nome}</option>
										</c:forEach>
									</select>

									<input type="text" name="aluno2" id="aluno2">

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();">Professores 
							
							<select name="professor2" id="professor2" disabled>
										<option>Professor:</option>
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos">Devolvidos
							
							<input type="submit" value="Pesquisar">
								</c:if>
								<c:if test="${opcoesMarcadas == '5'}">
									<input type="radio" name="option" value="todos"
										onclick="desabilitarAlunosProfessoresListar();">Todos
							
						<input type="radio" name="option" value="alunos"
										onclick="habilitarAlunosListar();">Alunos 
							
							<select name="turma2" id="turma2" disabled>
										<option>Turma:</option>
										<c:forEach items="${turmas}" var="turma">
											<option>${turma.nome}</option>
										</c:forEach>
									</select>

									<input type="text" name="aluno2" id="aluno2" disabled>

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();" checked>Professores 
							
							<select name="professor2" id="professor2">
										<option>Professor:</option>
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos"
										checked>Devolvidos
							
							<input type="submit" value="Pesquisar">
								</c:if>
								<c:if test="${opcoesMarcadas == '6'}">
									<input type="radio" name="option" value="todos"
										onclick="desabilitarAlunosProfessoresListar();">Todos
							
						<input type="radio" name="option" value="alunos"
										onclick="habilitarAlunosListar();">Alunos 
							
							<select name="turma2" id="turma2" disabled>
										<option>Turma:</option>
										<c:forEach items="${turmas}" var="turma">
											<option>${turma.nome}</option>
										</c:forEach>
									</select>

									<input type="text" name="aluno2" id="aluno2" disabled>

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();" checked>Professores 
							
							<select name="professor2" id="professor2">
										<option>Professor:</option>
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos">Devolvidos
							
							<input type="submit" value="Pesquisar">
								</c:if>

							</div>
						</form>
					</div>
					<div class="table-responsive">
						<table class="table table-bordered">
							<c:if test="${resultado == '1'}">
								<tr>
									<td class="active">Id</td>
									<td class="success">Livro</td>
									<td class="warning">Aluno</td>
									<td class="danger">Professor</td>
									<td class="danger">Turma</td>
									<td class="active">Data do Empréstimo</td>
									<td class="success">Data da Devolução</td>
									<td class="warning">Devolver</td>
									<td class="danger">Excluir</td>
									<td class="success">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td>

												<center>
													<input type="text" name="id" value="${emprestimos.id}" />
												</center>
											</td>

											<td>
												<center>
													<input type="text" name="tombo"
														value="${emprestimos.livro.tombo}" />
												</center>
											</td>

											<c:if test="${emprestimos.aluno.nome == null }">
												<td>Vazio</td>
											</c:if>

											<c:if test="${emprestimos.aluno.nome != null }">
												<td>
													<center>
														<input type="text" name="aluno"
															value="${emprestimos.aluno.nome}" />
													</center>
												</td>
											</c:if>

											<c:if test="${emprestimos.professor.nome == null }">
												<td>Vazio</td>
											</c:if>

											<c:if test="${emprestimos.professor.nome != null }">
												<td>
													<center>
														<input type="text" name="professor"
															value="${emprestimos.professor.nome}" />
													</center>
												</td>
											</c:if>

											<c:if test="${emprestimos.turma.nome == null }">
												<td>Vazio</td>
											</c:if>

											<c:if test="${emprestimos.turma.nome != null }">
												<td>
													<center>
														<input type="text" name="turma"
															value="${emprestimos.turma.nome}" />
													</center>
												</td>
											</c:if>

											<td>
												<center>
													<input type="text" name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" />
												</center>
											</td>

											<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
												<td id="campo_devolucao_${emprestimos.id}">Não
													devolvido</td>
											</c:if>

											<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
												<td id="campo_devolucao_${emprestimos.id}"><input
													type="text" name="dataDevolucao"
													value="${emprestimos.dataDevolucaoFormatada}" /></td>
											</c:if>

											<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
												<td id="emprestimo_${emprestimos.id}"><a href="#"
													onClick="realizarDevolucao(${emprestimos.id})">
														Devolver Agora </a></td>
											</c:if>

											<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
												<td>Devolvido</td>
											</c:if>
											<td><a href="#"
												onclick="removerEmprestimo(${emprestimos.id});"
												class="btn btn-danger">Excluir</a></td>
											<td><input type="submit" value="Alterar"
												class="btn btn-warning" /></td>
										</tr>
									</form>

								</c:forEach>
							</c:if>

							<c:if test="${resultado == '2'}">
								<tr>
									<td class="active">Id</td>
									<td class="success">Livro</td>
									<td class="warning">Aluno</td>
									<td class="danger">Professor</td>
									<td class="danger">Turma</td>
									<td class="active">Data do Empréstimo</td>
									<td class="success">Data da Devolução</td>
									<td class="warning">Devolver</td>
									<td class="danger">Excluir</td>
									<td class="success">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td><center>
													<input type="text" name="id" value="${emprestimos.id}" />
												</center></td>
											<td><center>
													<input type="text" name="tombo"
														value="${emprestimos.livro.tombo}" />
												</center></td>

											<c:if test="${emprestimos.aluno.nome == null }">
												<td>Vazio</td>
											</c:if>
											<c:if test="${emprestimos.aluno.nome != null }">
												<td><center>
														<input type="text" name="aluno"
															value="${emprestimos.aluno.nome}" />
													</center></td>
											</c:if>
											<c:if test="${emprestimos.professor.nome == null }">
												<td>Vazio</td>
											</c:if>
											<c:if test="${emprestimos.professor.nome != null }">
												<td><center>
														<input type="text" name="professor"
															value="${emprestimos.professor.nome}" />
													</center></td>
											</c:if>
											<c:if test="${emprestimos.turma.nome == null }">
												<td>Vazio</td>
											</c:if>
											<c:if test="${emprestimos.turma.nome != null }">
												<td><center>
														<input type="text" name="turma"
															value="${emprestimos.turma.nome}" />
													</center></td>
											</c:if>
											<td><center>
													<input type="text" name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" />
												</center></td>
											<td id="campo_devolucao_${emprestimos.id}">Não devolvido</td>
											<td id="emprestimo_${emprestimos.id}"><a href="#"
												onClick="realizarDevolucao(${emprestimos.id})"> Devolver
													Agora </a></td>
											<td><a href="#"
												onclick="removerEmprestimo(${emprestimos.id});"
												class="btn btn-danger">Excluir</a></td>
											<td><input type="submit" value="Alterar"
												class="btn btn-warning" /></td>
										</tr>
									</form>

								</c:forEach>
							</c:if>



							<c:if test="${resultado == '3'}">
								<tr>
									<td class="success">Id</td>
									<td class="success">Livro</td>
									<td class="success">Aluno</td>
									<td class="success">Turma</td>
									<td class="success">Data do Empréstimo</td>
									<td class="success">Data da Devolução</td>
									<td class="success">Devolver</td>
									<td class="success">Excluir</td>
									<td class="success">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td><center>
													<input type="text" name="id" value="${emprestimos.id}" />
												</center></td>
											<td><center>
													<input type="text" name="tombo"
														value="${emprestimos.livro.tombo}" />
												</center></td>
											<td><center>
													<input type="text" name="aluno"
														value="${emprestimos.aluno.nome}" />
												</center></td>
											<td><center>
													<input type="text" name="turma"
														value="${emprestimos.turma.nome}" />
												</center></td>
											<td><center>
													<input type="text" name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" />
												</center></td>
											<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
												<td id="campo_devolucao_${emprestimos.id}">Não
													devolvido</td>
											</c:if>
											<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
												<td id="campo_devolucao_${emprestimos.id}"><input
													type="text" name="dataDevolucao"
													value="${emprestimos.dataDevolucaoFormatada}" /></td>
											</c:if>
											<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
												<td id="emprestimo_${emprestimos.id}"><a href="#"
													onClick="realizarDevolucao(${emprestimos.id})">
														Devolver Agora </a></td>
											</c:if>
											<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
												<td>Devolvido</td>
											</c:if>
											<td><a href="#"
												onclick="removerEmprestimo(${emprestimos.id});"
												class="btn btn-danger">Excluir</a></td>
											<td><input type="submit" value="Alterar"
												class="btn btn-warning" /></td>
										</tr>
									</form>

								</c:forEach>
							</c:if>
							<c:if test="${resultado == '4'}">
								<tr>
									<td class="warning">Id</td>
									<td class="warning">Livro</td>
									<td class="warning">Aluno</td>
									<td class="warning">Turma</td>
									<td class="warning">Data do Empréstimo</td>
									<td class="warning">Data da Devolução</td>
									<td class="warning">Devolver</td>
									<td class="warning">Excluir</td>
									<td class="warning">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td><center>
													<input type="text" name="id" value="${emprestimos.id}" />
												</center></td>
											<td><center>
													<input type="text" name="tombo"
														value="${emprestimos.livro.tombo}" />
												</center></td>
											<td><center>
													<input type="text" name="aluno"
														value="${emprestimos.aluno.nome}" />
												</center></td>
											<td><center>
													<input type="text" name="turma"
														value="${emprestimos.turma.nome}" />
												</center></td>
											<td><center>
													<input type="text" name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" />
												</center></td>
											<td id="campo_devolucao_${emprestimos.id}">Não devolvido</td>
											<td id="emprestimo_${emprestimos.id}"><a href="#"
												onClick="realizarDevolucao(${emprestimos.id})"> Devolver
													Agora </a></td>
											<td><a href="#"
												onclick="removerEmprestimo(${emprestimos.id});"
												class="btn btn-danger">Excluir</a></td>
											<td><input type="submit" value="Alterar"
												class="btn btn-warning" /></td>
										</tr>
									</form>

								</c:forEach>
							</c:if>
							<c:if test="${resultado == '5'}">
								<tr>
									<td class="active">Id</td>
									<td class="active">Livro</td>
									<td class="active">Professor</td>
									<td class="active">Data do Empréstimo</td>
									<td class="active">Data da Devolução</td>
									<td class="active">Devolver</td>
									<td class="active">Excluir</td>
									<td class="active">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td><center>
													<input type="text" name="id" value="${emprestimos.id}" />
												</center></td>
											<td><center>
													<input type="text" name="tombo"
														value="${emprestimos.livro.tombo}" />
												</center></td>
											<td><center>
													<input type="text" name="professor"
														value="${emprestimos.professor.nome}" />
												</center></td>
											<td><center>
													<input type="text" name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" />
												</center></td>
											<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
												<td id="campo_devolucao_${emprestimos.id}">Não
													devolvido</td>
											</c:if>
											<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
												<td id="campo_devolucao_${emprestimos.id}"><input
													type="text" name="dataDevolucao"
													value="${emprestimos.dataDevolucaoFormatada}" /></td>
											</c:if>
											<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
												<td id="emprestimo_${emprestimos.id}"><a href="#"
													onClick="realizarDevolucao(${emprestimos.id})">
														Devolver Agora </a></td>
											</c:if>
											<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
												<td>Devolvido</td>
											</c:if>
											<td><a href="#"
												onclick="removerEmprestimo(${emprestimos.id});"
												class="btn btn-danger">Excluir</a></td>
											<td><input type="submit" value="Alterar"
												class="btn btn-warning" /></td>
										</tr>
									</form>

								</c:forEach>
							</c:if>
							<c:if test="${resultado == '6'}">
								<tr>
									<td class="danger">Id</td>
									<td class="danger">Livro</td>
									<td class="danger">Professor</td>
									<td class="danger">Data do Empréstimo</td>
									<td class="danger">Data da Devolução</td>
									<td class="danger">Devolver</td>
									<td class="danger">Excluir</td>
									<td class="danger">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td><center>
													<input type="text" name="id" value="${emprestimos.id}" />
												</center></td>
											<td><center>
													<input type="text" name="tombo"
														value="${emprestimos.livro.tombo}" />
												</center></td>
											<td><center>
													<input type="text" name="professor"
														value="${emprestimos.professor.nome}" />
												</center></td>
											<td><center>
													<input type="text" name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" />
												</center></td>
											<td id="campo_devolucao_${emprestimos.id}">Não devolvido</td>
											<td id="emprestimo_${emprestimos.id}"><a href="#"
												onClick="realizarDevolucao(${emprestimos.id})"> Devolver
													Agora </a></td>
											<td><a href="#"
												onclick="removerEmprestimo(${emprestimos.id});"
												class="btn btn-danger">Excluir</a></td>
											<td><input type="submit" value="Alterar"
												class="btn btn-warning" /></td>
										</tr>
									</form>

								</c:forEach>
							</c:if>
						</table>
					</div>
				</div>

				<a href="mostrarPainelAdministrador" class="link">
					<div class="glyphicon glyphicon-triangle-left"></div>
				</a>
			</div>
		</div>
	</div>
</body>
</html>