package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.ProfessorDAO;

public class TesteExcluirProfessor {

	public static void main(String[] args) {
		ProfessorDAO dao = new ProfessorDAO();
		dao.excluir(1L);
		System.out.println("Exclui você!!!");

	}

}
