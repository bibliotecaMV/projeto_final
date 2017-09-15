package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarTurmaPorId {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Turma turma = dao.buscarTurmaPorId(1L);
		System.out.println(turma.getNome());
	}
}
