package br.com.bibliotecaltv.teste.monitor;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarProfessorPorIdM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Professor professor = dao.buscarProfessorPorId(1L);
		System.out.println(professor.getNomeCompleto());
	}
}
