package br.com.bibliotecaltv.teste.monitor;


import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarIdAlunoM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Long id = dao.buscarIdAluno("Pedro Lucas");
		System.out.println(id);
	}
}
