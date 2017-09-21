package br.com.bibliotecaltv.dao;

import br.com.bibliotecaltv.controller.javabeans.Aluno;

public class AlunoDAO extends GenericDAO<Aluno, Long>{

	public void excluir(Long id){
		Aluno aExcluir = new Aluno();
		aExcluir.setId(id);
		super.excluir(aExcluir);
	}

}
