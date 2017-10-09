package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.GeneroDAO;
import br.com.bibliotecaltv.dao.LivroDAO;

public class TesteInserirLivro {
	public static void main(String[] args) throws Exception {
		LivroDAO daoLivro = new LivroDAO();
		GeneroDAO daoGenero = new GeneroDAO();
		Genero genero = daoGenero.listarPorId(Genero.class, 3L);
		
		Livro livro = new Livro();
		livro.setTombo("20170932");
		livro.setCDD(genero.getSigla());
		livro.setGenero(genero);
		livro.setAno_editado(2017L);
		livro.setAutor("Vinícius de Moraes");
		livro.setEditora("Bienal");
		livro.setExemplares(30L);
		livro.setForma_aquisicao("comprado");
		livro.setLocal_edicao("Nova York");
		livro.setTitulo("Casos de terror");
		livro.setVolume(1L);
		daoLivro.salvar(livro);
	}
}
