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