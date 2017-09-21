package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteExcluirTurma {
	public static void main(String[] args) {
		AdministradorDAO dao  = new AdministradorDAO();
		Long id_turma = dao.buscarIdTurma("3A");
		Turma turma = dao.buscarTurmaPorId(id_turma);
		dao.excluirTurma(turma);
		System.out.println("Exclui você 3A!!!");
	}
}
