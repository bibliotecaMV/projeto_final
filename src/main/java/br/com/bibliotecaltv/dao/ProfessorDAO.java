package br.com.bibliotecaltv.dao;

import br.com.bibliotecaltv.controller.javabeans.Professor;

public class ProfessorDAO extends GenericDAO<Professor, Long>{
     
	public void excluir(Long id) {
		Professor aExcluir = new Professor();
		aExcluir.setId(id);
		super.excluir(aExcluir);
	}
}
