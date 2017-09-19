package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarProfessor {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Professor professor = dao.buscarProfessorPorId(1L);
		professor.setMatricula(20L);
		professor.setNomeCompleto("Jucelino");
		dao.alterarProfessor(professor);
	}

}
