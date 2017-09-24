package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.GeneroDAO;
import br.com.bibliotecaltv.dao.LivroDAO;

public class TesteInserirLivro {
	public static void main(String[] args) throws Exception {
		LivroDAO daoLivro = new LivroDAO();
		GeneroDAO daoGenero = new GeneroDAO();
		Genero genero = daoGenero.listarPorId(Genero.class, 1L);
		
		Livro livro = new Livro();
		livro.setTombo("23112015");
		livro.setCDD(genero.getSigla());
		livro.setGenero(genero);
		livro.setAno_editado(2017L);
		livro.setAutor("Pedro Lucas Oliveira de Matos");
		livro.setEditora("Eryka");
		livro.setExemplares(30L);
		livro.setForma_aquisicao("comprado");
		livro.setLocal_edicao("Drag�o do Mar");
		livro.setTitulo("The Love");
		livro.setVolume(1L);
		daoLivro.salvar(livro);
	}
}
