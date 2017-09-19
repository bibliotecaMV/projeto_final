package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteExcluirGenero {

	public static void main(String[] args) {
		AdministradorDAO dao  = new AdministradorDAO();
		Long id_genero = dao.buscarIdGenero("Romance");
		Genero genero = dao.buscarGeneroPorId(id_genero);
		dao.excluirGenero(genero);
		System.out.println("Exclui você!!!");

	}
}
