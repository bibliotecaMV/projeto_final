package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarEmprestimoPorId {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Emprestimo emprestimo = dao.buscarEmprestimoPorId(7L);
		System.out.println(emprestimo.getAluno());
		System.out.println(emprestimo.getLivro());
		System.out.println(emprestimo.getDataEmprestimo());
	}
}
