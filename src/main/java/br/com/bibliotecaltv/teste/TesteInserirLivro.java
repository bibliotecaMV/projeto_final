package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInserirLivro {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		 
		String descricao_genero = "Romance";
		Long id_genero = dao.buscarIdGenero(descricao_genero);
		Genero genero = dao.buscarGeneroPorId(id_genero);
		
		Livro livro = new Livro();
		livro.setTombo("1235");
		livro.setCDD(genero.getSigla());
		livro.setGenero(genero);
		livro.setAno_editado(2000L);
		livro.setAutor("Tony");
		livro.setEditora("Eryka");
		livro.setExemplares(4L);
		livro.setForma_arquisicao("comprado");
		livro.setLocal_edicao("house");
		livro.setTitulo("The Love");
		livro.setVolume(1L);
		dao.adicionarLivro(livro);
	}
}
