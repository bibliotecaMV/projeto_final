package br.com.bibliotecaltv.teste.monitor;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarGeneroPorIdM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Genero genero = dao.buscarGeneroPorId(1L);
		System.out.println(genero.getDescricao());
	}
}
