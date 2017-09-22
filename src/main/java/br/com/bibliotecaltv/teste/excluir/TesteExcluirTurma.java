package br.com.bibliotecaltv.teste.excluir;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.TurmaDAO;


public class TesteExcluirTurma {
	public static void main(String[] args) throws Exception {
		TurmaDAO dao = new TurmaDAO();
		Turma turma = dao.listarPorId(Turma.class, 1L);
		dao.excluir(turma);
	}
}
