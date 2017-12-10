function removerGenero(id) {
	$.post("excluirGenero", {"id" : id}, function(){
		$("#linha_"+id).closest("tr").hide();
	});
}

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