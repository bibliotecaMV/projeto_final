package br.com.bibliotecaltv.teste;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteListarLivro {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		List<Livro> livro = dao.listarLivro();
		
		for(Livro livros: livro) {
			System.out.println(livros);
		}

	}

}
