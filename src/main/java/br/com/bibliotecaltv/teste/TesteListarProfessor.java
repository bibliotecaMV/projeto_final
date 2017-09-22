package br.com.bibliotecaltv.teste;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.ProfessorDAO;

public class TesteListarProfessor {

	public static void main(String[] args) {
		ProfessorDAO dao = new ProfessorDAO();
		List<Professor> professor = dao.listar(Professor.class);
		
		for(Professor professores: professor) {
			System.out.println(professores);
		}

	}

}
