package br.com.bibliotecaltv.teste.monitor;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteListarEmprestimoM {

	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		List<Emprestimo> emprestimo = dao.listarEmprestimo();
		
		for(Emprestimo emprestimos: emprestimo) {
			System.out.println(emprestimos);
		}

	}

}
