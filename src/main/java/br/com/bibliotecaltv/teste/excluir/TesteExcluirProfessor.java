package br.com.bibliotecaltv.teste.excluir;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.ProfessorDAO;


public class TesteExcluirProfessor {

	public static void main(String[] args) throws Exception {
		ProfessorDAO dao = new ProfessorDAO();
		Professor professor = dao.listarPorId(Professor.class, 1L);
		dao.excluir(professor);
	}

}
