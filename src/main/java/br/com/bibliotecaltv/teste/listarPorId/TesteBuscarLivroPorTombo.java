package br.com.bibliotecaltv.teste.listarPorId;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.LivroDAO;

public class TesteBuscarLivroPorTombo {
	public static void main(String[] args) throws Exception {
		LivroDAO dao = new LivroDAO();
		Livro livro = dao.listarPorId(Livro.class,"3455545");
		System.out.println(livro.getTitulo());
	}
}
