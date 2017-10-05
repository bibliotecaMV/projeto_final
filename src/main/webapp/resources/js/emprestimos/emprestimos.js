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
	document.getElementById("turma").disabled = false;
	document.getElementById("aluno").disabled = false;
	document.getElementById("professor").disabled = true;
}
function habilitarProfessoresAdicionar(){
	document.getElementById("turma").disabled = true;
	document.getElementById("aluno").disabled = true;
	document.getElementById("professor").disabled = false;
}
function habilitarAlunosListar(){
	document.getElementById("nome_turma").disabled = false;
	document.getElementById("nome_aluno").disabled = false;
	document.getElementById("nome_professor").disabled = true;
}
function habilitarProfessoresListar(){
	document.getElementById("nome_turma").disabled = true;
	document.getElementById("nome_aluno").disabled = true;
	document.getElementById("nome_professor").disabled = false;
}
function desabilitarAlunosProfessoresListar(){
	document.getElementById("nome_turma").disabled = true;
	document.getElementById("nome_aluno").disabled = true;
	document.getElementById("nome_professor").disabled = true;
}