package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdAluno {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id = dao.buscarIdAluno("Renato Richard");
		System.out.println(id);
	}
}
