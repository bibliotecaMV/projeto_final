package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarGenero {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Genero genero = dao.buscarGeneroPorId(1L);
		genero.setDescricao("Paródia");
		genero.setSigla("000");
		dao.alterarGenero(genero);

	}

}
