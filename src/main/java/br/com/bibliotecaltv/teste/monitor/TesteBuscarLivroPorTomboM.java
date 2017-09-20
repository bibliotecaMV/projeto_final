package br.com.bibliotecaltv.teste.monitor;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarLivroPorTomboM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Livro livro = dao.buscarLivroPorTombo("1235");
		System.out.println(livro.getTitulo());
	}
}
