package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInserirGenero {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Genero genero = new Genero();
		genero.setDescricao("Romance");
		genero.setSigla("000");
		dao.adicionarGenero(genero);
	}
}
