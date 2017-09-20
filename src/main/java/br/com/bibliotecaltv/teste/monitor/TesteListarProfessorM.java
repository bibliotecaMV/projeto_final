package br.com.bibliotecaltv.teste.monitor;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Professor;

import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteListarProfessorM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		List<Professor> professor = dao.listarProfessor();

		for (Professor professores : professor) {
			System.out.println(professores);
		}

	}
}
