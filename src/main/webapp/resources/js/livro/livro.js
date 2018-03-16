function habilitarBotaoOutro(){
	var campo = document.getElementById("forma_aquisicao-outro");
	console.log(document.getElementById("forma_aquisicao").value);
	if((document.getElementById("forma_aquisicao").value) == "Outro"){
		console.log("Entrou");
		campo.disabled = false;
		campo.required = true;
	}else{
		console.log("Caiu no else");
		campo.disabled = true;
		campo.required = false;
	}
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