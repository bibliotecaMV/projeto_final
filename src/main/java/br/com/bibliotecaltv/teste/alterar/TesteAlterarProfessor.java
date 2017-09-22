package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.ProfessorDAO;

public class TesteAlterarProfessor {

	public static void main(String[] args) throws Exception {
		ProfessorDAO dao = new ProfessorDAO();
		Professor professor = dao.listarPorId(Professor.class, 1L);
		professor.setMatricula("20");
		professor.setNomeCompleto("Jucelino");
		dao.alterar(professor);
	}

}
