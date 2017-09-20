package br.com.bibliotecaltv.teste.monitor;

import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarIdTurmaM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Long id_turma = dao.buscarIdTurma("3A");
		System.out.println(id_turma);
	}
}
