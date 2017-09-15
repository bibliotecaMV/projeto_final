package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarLivroPorTombo {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Livro livro = dao.buscarLivroPorTombo(1235L);
		System.out.println(livro.getTitulo());
	}
}
