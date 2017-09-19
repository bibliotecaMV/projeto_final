package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteExcluirProfessor {

	public static void main(String[] args) {
		AdministradorDAO dao  = new AdministradorDAO();
		Long id = dao.buscarIdProfessor("Pedro Lucas Oliveira de Matos");
		Professor professor= dao.buscarProfessorPorId(id);
		dao.excluirProfessor(professor);
		System.out.println("Exclui você!!!");

	}

}
