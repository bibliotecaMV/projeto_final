package br.com.bibliotecaltv.teste.monitor;

import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarIdProfessorM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Long id = dao.buscarIdProfessor("Kelmy Camurça");
		System.out.println(id);
	}
}
