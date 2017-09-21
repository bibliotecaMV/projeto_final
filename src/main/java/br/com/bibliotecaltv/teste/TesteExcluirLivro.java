package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;
import br.com.bibliotecaltv.dao.LivroDAO;

public class TesteExcluirLivro {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		LivroDAO daoLivro = new LivroDAO();
		Livro livro = dao.buscarLivroPorTombo("3455545");
		daoLivro.excluir(livro);
	}

}
