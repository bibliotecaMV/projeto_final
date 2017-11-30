function removerGenero(id) {
	$.post("excluirGenero", {"id" : id}, function(){
		$("#linha_"+id).closest("tr").hide();
	});
}

function testeLetras(e) {
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