package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdGenero {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id_genero = dao.buscarIdGenero("Romance","000");
		System.out.println(id_genero);
	}
}
