package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.TurmaDAO;

public class TesteAlterarTurma {

	public static void main(String[] args) throws Exception {
		TurmaDAO dao = new TurmaDAO();
		Turma turma = dao.listarPorId(Turma.class,1L);
		turma.setNome("1A");
		dao.alterar(turma);
	}

}
