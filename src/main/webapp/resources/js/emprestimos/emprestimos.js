function realizarDevolucao(id) {
	$.post("realizarDevolucao", {"id" : id}, function(resposta){
		$("#emprestimo_"+id).html("Devolvido");
		$("#campo_devolucao_"+id).html(resposta);
	});
}
function removerEmprestimo(id) {
	$.post("excluirEmprestimo", {"id" : id}, function(){
		$("#linha_"+id).closest("tr").hide();
	});
}
function habilitarAlunosAdicionar(){
	document.getElementById("turma1").disabled = false;
	document.getElementById("aluno1").disabled = false;
	document.getElementById("professor1").disabled = true;
}
function habilitarProfessoresAdicionar(){
	document.getElementById("turma1").disabled = true;
	document.getElementById("aluno1").disabled = true;
	document.getElementById("professor1").disabled = false;
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