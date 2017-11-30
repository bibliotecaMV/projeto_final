package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.GeneroDAO;
import br.com.bibliotecaltv.dao.LivroDAO;

public class TesteAlterarLivro {

	public static void main(String[] args) throws Exception {
		LivroDAO daoLivro = new LivroDAO();
		GeneroDAO daoGenero = new GeneroDAO();
		Livro livro = daoLivro.listarPorId(Livro.class,"2323");
		Genero genero = daoGenero.listarPorId(Genero.class, 1L);
		livro.setAutor("Thaynara");
		livro.setAno_editado(1985L);
		livro.setCDD("003");
		livro.setEditora("Gilmar");
		livro.setExemplares(40L);
		livro.setForma_aquisicao("comprado");
		livro.setLocal_edicao("Morro do macaco");
		livro.setTitulo("Iracema");
		livro.setGenero(genero);
		livro.setVolume(4L);
		daoLivro.alterar(livro);

	}

}
