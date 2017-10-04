function realizarDevolucao(id) {
	$.post("realizarDevolucao", {"id" : id}, function(resposta){
		$("#emprestimo_"+id).html("Devolvido");
		$("#campo_devolucao_"+id).html("<input type='text' name='dataDevolucaoFormatada' value="+resposta+" />");
	});
}
function removerEmprestimo(id) {
	$.post("excluirEmprestimo", {"id" : id}, function(){
		$("#linha_"+id).closest("tr").hide();
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