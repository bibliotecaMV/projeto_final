package br.com.bibliotecaltv.teste;

import java.util.List;
import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteListarProfessor {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		List<Professor> professor = dao.listarProfessor();
		
		for(Professor professores: professor) {
			System.out.println(professores);
		}

	}

}
