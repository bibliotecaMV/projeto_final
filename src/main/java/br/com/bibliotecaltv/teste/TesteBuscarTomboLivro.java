package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarTomboLivro {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long tombo = dao.buscarTomboLivro("The Love");
		System.out.println(tombo);
	}
}
