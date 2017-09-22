package br.com.bibliotecaltv.teste;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.LivroDAO;

public class TesteListarLivro {

	public static void main(String[] args) {
		LivroDAO dao = new LivroDAO();
		List<Livro> livro = dao.listar(Livro.class);
		
		for(Livro livros: livro) {
			System.out.println(livros);
		}

	}

}
