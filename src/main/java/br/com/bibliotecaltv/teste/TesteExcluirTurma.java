package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.TurmaDAO;

public class TesteExcluirTurma {
	public static void main(String[] args) {
		TurmaDAO dao = new TurmaDAO();
		dao.excluir(1L);
		System.out.println("Exclui você !!!");
	}
}
