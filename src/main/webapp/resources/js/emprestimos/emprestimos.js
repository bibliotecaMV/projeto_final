function realizarDevolucao(id) {
	$.post("realizarDevolucao", {"id" : id}, function(resposta){
		$("#emprestimo_"+id).html("Devolvido");
		$("#campo_devolucao_"+id).html(resposta);
	});
}

function mostrarExemplaresDoTombo(){
	console.log("Entrou");
	$.post("mostrarExemplaresDoTombo", {"tombo" : document.getElementById("tombo1").value}, function(resposta){
		var tombo = document.getElementById("tombo1");
		var exemplar = document.getElementById("exemplares1");
		var valor_tombo = document.getElementById("tombo1").value;
		var lista = resposta;
		var ids;

		var length = exemplar.options.length;        
		var i;
		for(i = exemplar.options.length-1 ; i>=0 ; i--)
		{
			exemplar.remove(i);
		}

		ids = lista.toString().replace("[", "");
		ids = ids.toString().replace("]", "");
		ids = ids.split(",");
		for(i=0; i<ids.length; i++){
			var option = document.createElement('option');
			option.value = ids[i];
			option.text = ids[i];
			exemplar.add(option);
		}
		exemplar.disabled = false;
		exemplar.required = true;
	});
}

function mostrarAlunosDaTurma() {
	if((document.getElementById("turma1").value) == "Selecione:"){
		var turma = document.getElementById("turma1");
		var aluno = document.getElementById("aluno1");

		var length = aluno.options.length;        
		var i;
		for(i = aluno.options.length-1 ; i>=0 ; i--)
		{
			aluno.remove(i);
		}
		aluno.disabled = true;
		aluno.required = true;
	}else{
		$.post("mostrarAlunosDaTurma", {"turma" : document.getElementById("turma1").value}, function(resposta){
			var turma = document.getElementById("turma1");
			var aluno = document.getElementById("aluno1");
			var selected = document.getElementById("turma1").value;
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
				aluno.add(option);
			}
			aluno.disabled = false;
			aluno.required = false;
		});
	}
}

function removerEmprestimo(id) {
	$.post("excluirEmprestimo", {"id" : id}, function(){
		$("#linha_"+id).closest("tr").hide();
	});
}	

function habilitarAlunosAdicionar(){
	document.getElementById("turma1").disabled = false;
	if(document.getElementById("aluno1").value == ""){
		document.getElementById("aluno1").disabled = true;
	}else{
		document.getElementById("aluno1").disabled = false;
	}
	document.getElementById("aluno1").required = true;
	document.getElementById("professor1").disabled = true;
	document.getElementById("professor1").required = false;
}

function habilitarProfessoresAdicionar(){
	document.getElementById("turma1").disabled = true;
	document.getElementById("aluno1").disabled = true;
	document.getElementById("aluno1").required= false;
	document.getElementById("professor1").disabled = false;
	document.getElementById("professor1").required = true;
}

function habilitarAlunosListar(){
	document.getElementById("turma2").disabled = false;
	document.getElementById("aluno2").disabled = false;
	document.getElementById("professor2").disabled = true;
}

function habilitarProfessorListar(){
	document.getElementById("turma2").disabled = true;
	document.getElementById("aluno2").disabled = true;
	document.getElementById("professor2").disabled = false;
}

function desabilitarAlunosProfessoresListar(){
	document.getElementById("turma2").disabled = true;
	document.getElementById("aluno2").disabled = true;
	document.getElementById("professor2").disabled = true;
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