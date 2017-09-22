package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.GeneroDAO;

public class TesteAlterarGenero {

	public static void main(String[] args) throws Exception {
		GeneroDAO dao = new GeneroDAO();
		Genero genero = dao.listarPorId(Genero.class, 1L);
		genero.setDescricao("Terror");
		genero.setSigla("005");
		dao.alterar(genero);
	}
}
