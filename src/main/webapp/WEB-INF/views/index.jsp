<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- As 3 meta tags acima *devem* vir em primeiro lugar dentro do `head`; qualquer outro conteúdo deve vir *após* essas tags -->
    <title>BIBLIOTECA LTV - MV INFORMATICA</title>

    <!-- Bootstrap -->
   
    <style type="text/css">
*{
	margin: 0;
	padding: 0;
	text-decoration: none;
}
body{
	background-color: white;
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
              <div class="col-lg-6" id="centro">

                    <a href="realizarLoginAdministrador" class="item" style="margin-left: 35px; margin-right: 35px;">


                          <div id="centraliza" class="centraliza" >
                             <center> <div class="circulo" >
                                  <img src="resources/img/adm.png" border="0">
                              </div></center>
                          </div>

                          <div class="titulo">
                              <div class="borda">
                                <center> <span>ADMINISTRADOR</span></center>
                              </div>
                          </div>
                    </a>

              </div>

                  <div class="col-lg-6" id="centro">

                    <a href="realizarLoginMonitor" class="item" style="margin-left: 35px; margin-right: 35px;">


                          <div id="centraliza" class="centraliza" >
                             <center> <div class="circulo" >
                                  <img src="resources/img/monitor.png" border="0">
                              </div></center>
                          </div>

                          <div class="titulo">
                              <div class="borda">
                                 <center> <span>MONITOR</span></center>
                              </div>
                          </div>
                      </a>

                  </div>

            </div>
        </div>
    </div>



    <!--/.Rodapé -->
    <hr>
    <footer class="footer">
      <div class="container">
        <p class="text-muted" align="center">© 2017 - Governo do Estado do Ceará - Todos os direitos reservados</p>
      </div>
    </footer>
    <!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
    <script src="resources/js/bootstrap.min.js"></script>
  </body>
</html>
