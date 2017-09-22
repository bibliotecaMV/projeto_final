package br.com.bibliotecaltv.teste.listarPorId;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.GeneroDAO;

public class TesteBuscarGeneroPorId {
	public static void main(String[] args) throws Exception {
		GeneroDAO dao = new GeneroDAO();
		Genero genero = dao.listarPorId(Genero.class, 1L);
		System.out.println(genero.getDescricao());
	}
}
