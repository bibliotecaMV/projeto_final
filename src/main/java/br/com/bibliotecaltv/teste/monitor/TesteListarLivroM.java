package br.com.bibliotecaltv.teste.monitor;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteListarLivroM {

	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		List<Livro> livro = dao.listarLivro();
		
		for(Livro livros: livro) {
			System.out.println(livros);
		}

	}

}
