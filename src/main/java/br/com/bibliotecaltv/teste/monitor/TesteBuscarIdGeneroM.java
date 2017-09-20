package br.com.bibliotecaltv.teste.monitor;


import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarIdGeneroM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Long id_genero = dao.buscarIdGenero("Romance");
		System.out.println(id_genero);
	}
}
