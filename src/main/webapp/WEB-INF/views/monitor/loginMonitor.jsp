<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BIBLIOTECA LTV - MV INFORMATICA</title>

<!-- Bootstrap -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
*{
	margin: 0;
	padding: 0;
	text-decoration: none;
}

#centraliza{
	text-align: center;
}

.centraliza{
	text-align: center; 
}

a.item{ 
    text-decoration: none; 
    width: 160px;
    height: 195px;
    margin: 0px 35px;
}

.item .circulo{ 
	background-color: #ef8d1a; 
    width: 160px; 
    height: 160px; 
    display: table-cell;  
    vertical-align: middle; 
    border-radius: 50%;    
    -moz-border-radius: 50%;  
    -webkit-border-radius: 50%;

}

.item .circulo2{ 
	background-color: #ef8d1a; 
    width: 80px; 
    height: 80px; 
    display: table-cell;  
    vertical-align: middle; 
    border-radius: 50%;    
    -moz-border-radius: 50%;  
    -webkit-border-radius: 50%;

}

.item .titulo{ 
	color: #3baa72; 
	width: 150px; 
	margin: 0px auto; 
	margin-top: 10px; 
}

.item .borda{ 
	background: #FFF; 
	border: 1px solid #9dd4b8; 
	padding: 5px; 
	border-radius: 8px;
	-moz-border-radius: 8px; 
	-webkit-border-radius: 8px; 
	}
     a.item:hover .circulo{ 
     	background-color: #f0bd1f;
     }
    a.item:hover .borda{ 
    	background-color: #ef8d1a; 
    	 border:1px solid #ef8d1a; 
    	 color: #FFF}

     .link{
    text-decoration: none;
}


#alert{
    padding-top: 260px;
    text-align: center;
}

#link{
    text-decoration: none;
}
</style>
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
                <div class="panel-heading"> <center>MONITOR</center>
                </div>
                <div class="panel-body">
                    <form method="post" action="verificarLoginMonitor" class="form-horizontal">
                        <div class="form-group">
	                      <label for="usuario" class="col-sm-3 control-label">Usuário</label>
	                      <div class="col-sm-5">
	                        <input type="text" class="form-control" id="usuario" placeholder="caahup1" name="usuario" required/>
	                      </div>
	                    </div>

	                    <div class="form-group">
	                      <label for="senha" class="col-sm-3 control-label" >Senha</label>
	                      <div class="col-sm-5">
	                        <input type="password" class="form-control" id="senha" placeholder="********" name="senha" required/>
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
    <a href="main.html" class="link">
    <div class="glyphicon glyphicon-triangle-left">
    </div></a>

    <!--/.Rodapé -->
    <hr>
    <footer class="footer">
      <div class="container">
        <p class="text-muted" align="center">© 2017 - Governo do Estado do Ceará - Todos os direitos reservados</p>
      </div>
    </footer>
</body>
</html>