package br.com.bibliotecaltv.teste.monitor;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarTurmaPorIdM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Turma turma = dao.buscarTurmaPorId(1L);
		System.out.println(turma.getNome());
	}
}
