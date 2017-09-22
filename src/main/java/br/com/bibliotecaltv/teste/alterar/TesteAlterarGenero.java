package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarGenero {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Genero genero = dao.buscarGeneroPorId(1L);
		genero.setDescricao("Terro");
		genero.setSigla("005");
		dao.alterarGenero(genero);

	}

}
