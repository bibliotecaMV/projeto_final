function mostrarAlunosDaTurmaMonitor() {
	if((document.getElementById("turma").value) == "Selecione:"){
		var turma = document.getElementById("turma");
		var aluno = document.getElementById("aluno");

		var length = aluno.options.length;        
		var i;
		for(i = aluno.options.length-1 ; i>=0 ; i--)
		{
			aluno.remove(i);
		}
		aluno.disabled = true;
		aluno.required = true;
	}else{
		$.post("mostrarAlunosDaTurma", {"turma" : document.getElementById("turma").value}, function(resposta){
			var turma = document.getElementById("turma");
			var aluno = document.getElementById("aluno");
			var selected = document.getElementById("turma").value;
			var lista = resposta;
			var nomes;

			var length = aluno.options.length;        
			var i;
			for(i = aluno.options.length-1 ; i>=0 ; i--)
			{
				aluno.remove(i);
			}

			nomes = lista.toString().replace("[", "");
			nomes = nomes.toString().replace("]", "");
			nomes = nomes.split(",");
			for(i=0; i<nomes.length; i++){
				var option = document.createElement('option');
				option.value = nomes[i];
				option.text = nomes[i];
			}
			aluno.add(option);
			aluno.disabled = false;
			aluno.required = false;
		});
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