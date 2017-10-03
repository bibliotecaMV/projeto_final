function realizarDevolucao(id) {
	$.post("realizarDevolucao", {"id" : id}, function(resposta){
		$("#emprestimo_"+id).html("Devolvido");
		$("#campo_devolucao_"+id).html(resposta);
	});
}
function habilitarAlunos(){
	document.getElementById("turma").disabled = false;
	document.getElementById("aluno").disabled = false;
	document.getElementById("professor").disabled = true;
}
function habilitarProfessores(){
	document.getElementById("turma").disabled = true;
	document.getElementById("aluno").disabled = true;
	document.getElementById("professor").disabled = false;
}