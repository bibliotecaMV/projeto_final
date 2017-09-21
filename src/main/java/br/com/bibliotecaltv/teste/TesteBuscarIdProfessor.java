package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdProfessor {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id = dao.buscarIdProfessor("Edy Vidal",3455545L);
		System.out.println(id);
	}
}
