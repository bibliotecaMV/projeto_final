function testeLetras(e)
{
	var expressao;

	expressao = /[a-zA-Z\u00C0-\u00FF ]+/i;
	
	if(expressao.test(String.fromCharCode(e.keyCode)))
	{
		return true;
	}
	else
	{
		return false;
	}
}
function testeNumeros(e)
{
	var expressao;

	expressao = /[0-9]/;

	if(expressao.test(String.fromCharCode(e.keyCode)))
	{
		return true;
	}
	else
	{
		return false;
	}
}
function testarAcessibilade(pagina){
	if(pagina == "livros"){
		alert("Deu certo, livros!");
	}else if(pagina == "alunos"){
		$post("checarConteudoAluno");
	}else if(pagina == "emprestimos"){
		alert("Deu certo, empréstimos!");
	}else if(pagina == "monitores"){
		alert("Deu certo, monitores");
	}
}