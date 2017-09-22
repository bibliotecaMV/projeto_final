package br.com.bibliotecaltv.teste.buscarId;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdAluno {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id = dao.buscarIdAluno("Lucas",25L,"3579243");
		System.out.println(id);
	}
}
