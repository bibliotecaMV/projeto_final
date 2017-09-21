package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteExcluirProfessor {

	public static void main(String[] args) {
		AdministradorDAO dao  = new AdministradorDAO();
		Long id = dao.buscarIdProfessor("kelmy","3455689");
		Professor professor= dao.buscarProfessorPorId(id);
		dao.excluirProfessor(professor);
		System.out.println("Exclui você!!!");

	}

}
