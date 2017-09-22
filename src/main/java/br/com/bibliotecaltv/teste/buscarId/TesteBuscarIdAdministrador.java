package br.com.bibliotecaltv.teste.buscarId;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdAdministrador {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id = dao.buscarIdAdministrador("Carla Valéria","13042000");
		System.out.println(id);
	}
}
