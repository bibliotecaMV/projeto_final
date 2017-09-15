package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarProfessorPorId {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Professor professor = dao.buscarProfessorPorId(1L);
		System.out.println(professor.getNomeCompleto());
	}
}
