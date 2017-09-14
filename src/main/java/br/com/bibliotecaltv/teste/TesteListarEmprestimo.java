package br.com.bibliotecaltv.teste;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Emprestimo;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteListarEmprestimo {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		List<Emprestimo> emprestimo = dao.listarEmprestimo();
		
		for(Emprestimo emprestimos: emprestimo) {
			System.out.println(emprestimos);
		}

	}

}
