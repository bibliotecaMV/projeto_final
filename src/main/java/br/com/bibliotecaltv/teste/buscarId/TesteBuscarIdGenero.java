package br.com.bibliotecaltv.teste.buscarId;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdGenero {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id_genero = dao.buscarIdGenero("Lógica","003");
		System.out.println(id_genero);
	}
}
