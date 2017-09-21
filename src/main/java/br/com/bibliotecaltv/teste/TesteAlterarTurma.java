package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarTurma {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Turma turma = dao.buscarTurmaPorId(2L);
		turma.setNome("3A");
		dao.alterarTurma(turma);
	}

}
