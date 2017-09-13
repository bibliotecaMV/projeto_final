package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TestBuscarPorTurma {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Livro livro = dao.buscarLivroPorId(1L);
		System.out.println(livro.getCDD());
	}
}
