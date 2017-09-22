package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarGenero {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Genero genero = dao.buscarGeneroPorId(3L);
		genero.setDescricao("Lógica");
		genero.setSigla("003");
		dao.alterarGenero(genero);

	}

}
