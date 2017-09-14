package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TestePegarIdGenero {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		System.out.println(dao.buscarIdGenero("Romance"));
	}
}
