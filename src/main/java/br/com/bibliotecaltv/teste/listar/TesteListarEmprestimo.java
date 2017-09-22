package br.com.bibliotecaltv.teste.listar;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.dao.EmprestimoDAO;

public class TesteListarEmprestimo {

	public static void main(String[] args) throws Exception {
		EmprestimoDAO dao = new EmprestimoDAO();
		List<Emprestimo> emprestimo = dao.listar(Emprestimo.class);
		
		for(Emprestimo emprestimos: emprestimo) {
			System.out.println(emprestimos);
		}

	}

}
