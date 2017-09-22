package br.com.bibliotecaltv.teste.listarPorId;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.TurmaDAO;

public class TesteBuscarTurmaPorId {
	public static void main(String[] args) throws Exception {
		TurmaDAO dao = new TurmaDAO();
		Turma turma = dao.listarPorId(Turma.class, 1L);
		System.out.println(turma.getNome());
	}
}
