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

<body>
	<!-- TOPO-->
	<nav class="navbar navbar-default">
		<div class="container">
			<div id="logo" align="center">
				<img src="resources/img/logo.png">
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="starter-template">
			<h3 align="center">Sistema Gerenciador de Biblioteca</h3>
			<p align="center">SEJA BEM VINDO</p>
		</div>
	</div>

	<div class="container">
		<div id="content">
			<div class="row">
				<div class="panel panel-warning">
					<div class="panel-heading">
						<center>MONITOR</center>
					</div>
					<div class="panel-body">
						<form method="post" action="verificarLoginMonitor"
							class="form-horizontal">
							<div class="form-group">
								<label for="usuario" class="col-sm-3 control-label">Usuário</label>
								<div class="col-sm-5">
									<input type="text" class="form-control" id="usuario"
										placeholder="caahup1" name="usuario" required />
								</div>
							</div>

							<div class="form-group">
								<label for="senha" class="col-sm-3 control-label">Senha</label>
								<div class="col-sm-5">
									<input type="password" class="form-control" id="senha"
										placeholder="********" name="senha" required />
								</div>
							</div>
							<div class="modal-footer">
								<button type="reset" class="btn btn-danger">Limpar</button>
								<button type="submit" class="btn btn-warning">Acessar</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<a href="mostrarInicio"
		class="link btn btn-warning btn-custom "> <span
		class="glyphicon glyphicon-chevron-left img-circle text-primary btn-icon"></span>
		Voltar
	</a>

	<!--/.Rodapé -->
	<hr>
	<footer class="footer">
		<div class="container">
			<p class="text-muted" align="center">© 2017 - Governo do Estado
				do Ceará - Todos os direitos reservados</p>
		</div>
	</footer>
</body>
</html>