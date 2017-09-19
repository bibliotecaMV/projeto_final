package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdAdministrador {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id = dao.buscarIdAdministrador("Renato","123");
		System.out.println(id);
	}
}
