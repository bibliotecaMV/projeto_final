package br.com.bibliotecaltv.teste.listarPorId;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.dao.EmprestimoDAO;

public class TesteBuscarEmprestimoPorId {
	public static void main(String[] args) throws Exception {
		EmprestimoDAO dao = new EmprestimoDAO();
		Emprestimo emprestimo = dao.listarPorId(Emprestimo.class, 7L);
		System.out.println(emprestimo.getAluno());
		System.out.println(emprestimo.getLivro());
		System.out.println(emprestimo.getDataEmprestimo());
	}
}
