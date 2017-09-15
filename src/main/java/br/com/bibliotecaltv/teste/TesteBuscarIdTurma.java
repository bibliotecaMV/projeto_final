package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdTurma {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id_turma = dao.buscarIdTurma("3A");
		System.out.println(id_turma);
	}
}
