function removerGenero(id) {
	$.post("excluirGenero", {"id" : id}, function(){
		$("#linha_"+id).closest("tr").hide();
	});
}