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
	
<script src="resources/js/validator.min.js"></script>
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
				<a class="navbar-brand">Usu�rio administrador</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right">
					<button type="button" class="btn btn-warning" data-toggle="modal"
						data-target="#encerrar">Encerrar a sess�o</button>
				</form>
			</div>
		</div>
	</nav>



	<div class="container">
		<div id="content">
			<div class="row">

				<div class="panel panel-warning">
					<div class="panel-heading">
						<h3 class="panel-title">Empr�stimos</h3>
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
						method="POST" name="formulario" data-toggle="validator" role="form">
						<div class="form-group">
							<label for="tombo1" class="col-sm-2 control-label">Tombo:</label>
							<div class="col-sm-4">
								<input type="text" class="form-control" id="tombo1"
									name="tombo1" required onkeypress="return testeNumeros(event)" />
							</div>
							<div class="col-sm-4" onclick="mostrarExemplaresDoTombo();">
								<input type="button" class="btn btn-success" value="Buscar exemplares" />
							</div>
						</div>
						
						<div class="form-group">
							<label for="exemplares1" class="col-sm-2 control-label">N�mero do exemplar:</label>
							<div class="col-sm-1">
								<select class="form-control" name="exemplares1" id="exemplares1" disabled required>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label for="turma1" class="col-sm-2 control-label">Turma:</label>
							<div class="col-sm-3">
								<select class="form-control" name="turma1" id="turma1" 
									onchange="mostrarAlunosDaTurma();">
									<option>Selecione:</option>
									<c:forEach items="${turmas}" var="turma">
										<option>${turma.nome}</option>
									</c:forEach>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label for="aluno1" class="col-sm-2 control-label">Nome
								do aluno:</label>
							<div class="col-sm-3">
								<select class="form-control" name="aluno1" id="aluno1" disabled required = "true">
									<c:if test="${alunos != null})">
										<c:forEach items="${alunos}" var="aluno">
											<option>${aluno.nome}</option>
										</c:forEach>
									</c:if>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label for="professor1" class="col-sm-2 control-label">Professor:</label>
							<div class="col-sm-3">
								<select class="form-control" name="professor1" id="professor1"
									disabled required = "false">
									<c:forEach items="${professores}" var="professor">
										<option>${professor.nome}</option>
									</c:forEach>
								</select>
							</div>
						</div>

						<div class="modal-footer">
							<button type="reset" class="btn btn-danger">Limpar</button>
							<button type="submit" class="btn btn-warning">Realizar
								Empr�stimo</button>
						</div>

					</form>
				</div>


				<hr>

				<div class="panel panel-warning">
					<div class="panel-heading">
						<h3 class="panel-title">Lista</h3>
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

									<input type="text" name="aluno2" id="aluno2" disabled
										onkeypress="return testeLetras(event)"
										placeholder="Nome do aluno">

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();">Professores 
									
									<select name="professor2" id="professor2" disabled>
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos"
										checked>Devolvidos
									
									<input class="btn btn-default" type="submit" value="Pesquisar">
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

									<input type="text" name="aluno2" id="aluno2" disabled
										onkeypress="return testeLetras(event)"
										placeholder="Nome do aluno">

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();">Professores 
					
					<select name="professor2" id="professor2" disabled>
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos">Devolvidos
					
					<input class="btn btn-default" type="submit" value="Pesquisar">
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

									<input type="text" name="aluno2" id="aluno2"
										onkeypress="return testeLetras(event)"
										placeholder="Nome do aluno">

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();">Professores 
					
					<select name="professor2" id="professor2" disabled>
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos"
										checked>Devolvidos
					
					<input class="btn btn-default" type="submit" value="Pesquisar">
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

									<input type="text" name="aluno2" id="aluno2"
										onkeypress="return testeLetras(event)"
										placeholder="Nome do aluno">

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();">Professores 
							
							<select name="professor2" id="professor2" disabled>
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos">Devolvidos
							
							<input class="btn btn-default" type="submit" value="Pesquisar">
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

									<input type="text" name="aluno2" id="aluno2" disabled
										onkeypress="return testeLetras(event)"
										placeholder="Nome do aluno">

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();" checked>Professores 
							
							<select name="professor2" id="professor2">
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos"
										checked>Devolvidos
							
							<input class="btn btn-default" type="submit" value="Pesquisar">
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

									<input type="text" name="aluno2" id="aluno2" disabled
										onkeypress="return testeLetras(event)"
										placeholder="Nome do aluno">

									<input type="radio" name="option" value="professores"
										onclick="habilitarProfessorListar();" checked>Professores 
							
							<select name="professor2" id="professor2">
										<c:forEach items="${professores}" var="professor">
											<option>${professor.nome}</option>
										</c:forEach>
									</select>

									<input type="checkbox" name="selection" value="devolvidos">Devolvidos
							
							<input class="btn btn-default" type="submit" value="Pesquisar">
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
									<td class="active">Data do Empr�stimo</td>
									<td class="success">Data da Devolu��o</td>
									<td class="warning">Devolver</td>
									<td class="danger">Excluir</td>
									<td class="success">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td>

												<center>
													<input class="form-control" type="text" name="id"
														value="${emprestimos.id}" readonly />
												</center>
											</td>

											<td>
												<center>
													<input class="form-control" type="text" name="tombo"
														value="${emprestimos.livro.tombo}" required
														onkeypress="return testeNumeros(event)" />
												</center>
											</td>

											<c:if test="${emprestimos.aluno.nome == null }">
												<td><center>Vazio</center></td>
											</c:if>

											<c:if test="${emprestimos.aluno.nome != null }">
												<td>
													<center>
														<input class="form-control" type="text" name="aluno"
															value="${emprestimos.aluno.nome}" required
															onkeypress="return testeLetras(event)" />
													</center>
												</td>
											</c:if>

											<c:if test="${emprestimos.professor.nome == null }">
												<td><center>Vazio</center></td>
											</c:if>

											<c:if test="${emprestimos.professor.nome != null }">
												<td>
													<center>
														<select class="form-control" name="professor"
															id="professor">
															<c:forEach items="${professores}" var="professor">
																<c:if
																	test="${professor.nome == emprestimos.professor.nome }">
																	<option selected>${professor.nome}</option>
																</c:if>
																<c:if
																	test="${professor.nome != emprestimos.professor.nome }">
																	<option>${professor.nome}</option>
																</c:if>
															</c:forEach>
														</select>
													</center>
												</td>
											</c:if>

											<c:if test="${emprestimos.turma.nome == null }">
												<td><center>Vazio</center></td>
											</c:if>

											<c:if test="${emprestimos.turma.nome != null }">
												<td>
													<center>
														<select class="form-control" name="turma" id="turma">
															<c:forEach items="${turmas}" var="turma">
																<c:if test="${emprestimos.turma.nome == turma.nome }">
																	<option selected>${turma.nome}</option>
																</c:if>
																<c:if test="${emprestimos.turma.nome != turma.nome }">
																	<option>${turma.nome}</option>
																</c:if>
															</c:forEach>
														</select>
													</center>
												</td>
											</c:if>

											<td>
												<center>
													<input class="form-control" type="text"
														name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" required />
												</center>
											</td>

											<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
												<td id="campo_devolucao_${emprestimos.id}">N�o
													devolvido</td>
											</c:if>

											<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
												<td id="campo_devolucao_${emprestimos.id}"><input
													class="form-control" type="text" name="dataDevolucao"
													value="${emprestimos.dataDevolucaoFormatada}" required /></td>
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
									<td class="active">Data do Empr�stimo</td>
									<td class="success">Data da Devolu��o</td>
									<td class="warning">Devolver</td>
									<td class="danger">Excluir</td>
									<td class="success">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td><center>
													<input class="form-control" type="text" name="id"
														value="${emprestimos.id}" disabled />
												</center></td>
											<td><center>
													<input class="form-control" type="text" name="tombo"
														value="${emprestimos.livro.tombo}" required />
												</center></td>

											<c:if test="${emprestimos.aluno.nome == null }">
												<td><center>Vazio</center></td>
											</c:if>
											<c:if test="${emprestimos.aluno.nome != null }">
												<td><center>
														<input class="form-control" type="text" name="aluno"
															value="${emprestimos.aluno.nome}" required />
													</center></td>
											</c:if>
											<c:if test="${emprestimos.professor.nome == null }">
												<td><center>Vazio</center></td>
											</c:if>
											<c:if test="${emprestimos.professor.nome != null }">
												<td>
													<center>
														<select class="form-control" name="professor"
															id="professor">
															<c:forEach items="${professores}" var="professor">
																<c:if
																	test="${professor.nome == emprestimos.professor.nome }">
																	<option selected>${professor.nome}</option>
																</c:if>
																<c:if
																	test="${professor.nome != emprestimos.professor.nome }">
																	<option>${professor.nome}</option>
																</c:if>
															</c:forEach>
														</select>
													</center>
												</td>
											</c:if>
											<c:if test="${emprestimos.turma.nome == null }">
												<td><center>Vazio</center></td>
											</c:if>
											<c:if test="${emprestimos.turma.nome != null }">
												<td><center>
														<input class="form-control" type="text" name="turma"
															value="${emprestimos.turma.nome}" required />
													</center></td>
											</c:if>
											<td><center>
													<input class="form-control" type="text"
														name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" required />
												</center></td>
											<td id="campo_devolucao_${emprestimos.id}">N�o devolvido</td>
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
									<td class="success">Data do Empr�stimo</td>
									<td class="success">Data da Devolu��o</td>
									<td class="success">Devolver</td>
									<td class="success">Excluir</td>
									<td class="success">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td><center>
													<input class="form-control" type="text" name="id"
														value="${emprestimos.id}" disabled />
												</center></td>
											<td><center>
													<input class="form-control" type="text" name="tombo"
														value="${emprestimos.livro.tombo}" required />
												</center></td>
											<td><center>
													<input class="form-control" type="text" name="aluno"
														value="${emprestimos.aluno.nome}" required />
												</center></td>
											<td><center>
													<input class="form-control" type="text" name="turma"
														value="${emprestimos.turma.nome}" required />
												</center></td>
											<td><center>
													<input class="form-control" type="text"
														name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" required />
												</center></td>
											<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
												<td id="campo_devolucao_${emprestimos.id}">N�o
													devolvido</td>
											</c:if>
											<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
												<td id="campo_devolucao_${emprestimos.id}"><input
													class="form-control" type="text" name="dataDevolucao"
													value="${emprestimos.dataDevolucaoFormatada}" required /></td>
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
									<td class="warning">Data do Empr�stimo</td>
									<td class="warning">Data da Devolu��o</td>
									<td class="warning">Devolver</td>
									<td class="warning">Excluir</td>
									<td class="warning">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td><center>
													<input class="form-control" type="text" name="id"
														value="${emprestimos.id}" disabled />
												</center></td>
											<td><center>
													<input class="form-control" type="text" name="tombo"
														value="${emprestimos.livro.tombo}" required />
												</center></td>
											<td><center>
													<input class="form-control" type="text" name="aluno"
														value="${emprestimos.aluno.nome}" required />
												</center></td>
											<td><center>
													<input class="form-control" type="text" name="turma"
														value="${emprestimos.turma.nome}" required />
												</center></td>
											<td><center>
													<input class="form-control" type="text"
														name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" required />
												</center></td>
											<td id="campo_devolucao_${emprestimos.id}">N�o devolvido</td>
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
									<td class="active">Data do Empr�stimo</td>
									<td class="active">Data da Devolu��o</td>
									<td class="active">Devolver</td>
									<td class="active">Excluir</td>
									<td class="active">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td><center>
													<input class="form-control" type="text" name="id"
														value="${emprestimos.id}" disabled />
												</center></td>
											<td><center>
													<input class="form-control" type="text" name="tombo"
														value="${emprestimos.livro.tombo}" required />
												</center></td>
											<td>
												<center>
													<select class="form-control" name="professor"
														id="professor">
														<c:forEach items="${professores}" var="professor">
															<c:if
																test="${professor.nome == emprestimos.professor.nome }">
																<option selected>${professor.nome}</option>
															</c:if>
															<c:if
																test="${professor.nome != emprestimos.professor.nome }">
																<option>${professor.nome}</option>
															</c:if>
														</c:forEach>
													</select>
												</center>
											</td>
											<td><center>
													<input class="form-control" type="text"
														name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" required />
												</center></td>
											<c:if test="${emprestimos.dataDevolucaoFormatada == null}">
												<td id="campo_devolucao_${emprestimos.id}">N�o
													devolvido</td>
												<td id="emprestimo_${emprestimos.id}"><a href="#"
													onClick="realizarDevolucao(${emprestimos.id})">
														Devolver Agora </a></td>
											</c:if>
											<c:if test="${emprestimos.dataDevolucaoFormatada != null}">
												<td id="campo_devolucao_${emprestimos.id}"><input
													class="form-control" type="text" name="dataDevolucao"
													value="${emprestimos.dataDevolucaoFormatada}" required /></td>
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
									<td class="danger">Data do Empr�stimo</td>
									<td class="danger">Data da Devolu��o</td>
									<td class="danger">Devolver</td>
									<td class="danger">Excluir</td>
									<td class="danger">Alterar</td>
								</tr>
								<c:forEach var="emprestimos" items="${emprestimos}">
									<form action="alterarEmprestimo" method="post">
										<tr id="linha_${emprestimos.id}">
											<td><center>
													<input class="form-control" type="text" name="id"
														value="${emprestimos.id}" disabled />
												</center></td>
											<td><center>
													<input class="form-control" type="text" name="tombo"
														value="${emprestimos.livro.tombo}" required />
												</center></td>
											<td>
												<center>
													<select class="form-control" name="professor"
														id="professor">
														<c:forEach items="${professores}" var="professor">
															<c:if
																test="${professor.nome == emprestimos.professor.nome }">
																<option selected>${professor.nome}</option>
															</c:if>
															<c:if
																test="${professor.nome != emprestimos.professor.nome }">
																<option>${professor.nome}</option>
															</c:if>
														</c:forEach>
													</select>
												</center>

											</td>
											<td><center>
													<input class="form-control" type="text"
														name="dataEmprestimo"
														value="${emprestimos.dataEmprestimoFormatada}" required />
												</center></td>
											<td id="campo_devolucao_${emprestimos.id}">N�o devolvido</td>
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
			</div>
		</div>
	</div>

	<!-- Modal -->
	<div class="modal fade" id="encerrar" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Encerrar a sess�o</h4>
				</div>
				<div class="modal-body">Voc� realmente quer encerrar sua
					sess�o?</div>
				<div class="modal-footer">
					<a href="logoutAdministrador" class="link">
						<button type="button" class="btn btn-warning">Sim</button>
					</a>
					<button type="button" class="btn btn-danger" data-dismiss="modal">N�o</button>
				</div>
			</div>
		</div>
	</div>

	<a href="mostrarPainelAdministrador"
		class="link btn btn-warning btn-custom "> <span
		class="glyphicon glyphicon-chevron-left img-circle text-primary btn-icon"></span>
		Voltar
	</a>

	<!-- jQuery (obrigat�rio para plugins JavaScript do Bootstrap) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necess�rio -->
	<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>