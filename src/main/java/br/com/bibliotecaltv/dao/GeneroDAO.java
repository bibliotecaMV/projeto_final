package br.com.bibliotecaltv.dao;

import br.com.bibliotecaltv.controller.javabeans.Genero;

public class GeneroDAO extends GenericDAO<Genero, Long> {
	
	public void excluir(Long id) {
		Genero generoExcluir = new Genero();
		generoExcluir.setId(1L);
		super.excluir(generoExcluir);
	}
}
