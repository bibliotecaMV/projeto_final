package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarIdMonitores {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id_monitores = dao.buscarIdMonitores("Adriane Damião", "Dry");
		System.out.println(id_monitores);
	}
}
