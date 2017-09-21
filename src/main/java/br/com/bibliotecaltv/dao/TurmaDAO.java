package br.com.bibliotecaltv.dao;

import br.com.bibliotecaltv.controller.javabeans.Turma;

public class TurmaDAO extends GenericDAO<Turma, Long> {
   
	public void excluir(Long id) {
		Turma aExcluir = new Turma();
		aExcluir.setId(id);
		super.excluir(aExcluir);
	}
}
