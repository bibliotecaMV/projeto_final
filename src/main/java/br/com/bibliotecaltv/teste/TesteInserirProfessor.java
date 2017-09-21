package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.ProfessorDAO;

public class TesteInserirProfessor {
	public static void main(String[] args) {
		ProfessorDAO dao = new ProfessorDAO(); 
		Professor professor = new Professor();
		professor.setMatricula("3455545");
		professor.setNomeCompleto("Edy Vidal");
		dao.salvar(professor);
	}
}
