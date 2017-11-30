function testeLetras(e)
{
	var expressao;

	expressao = /[0-9]/;

	if(expressao.test(String.fromCharCode(e.keyCode)))
	{
		return false;
	}
	else
	{
		return true;
	}
}
function testeNumeros(e)
{
	var expressao;

	expressao = /[a-zA-Z]/;

	if(expressao.test(String.fromCharCode(e.keyCode)))
	{
		return false;
	}
	else
	{
		return true;
	}
}