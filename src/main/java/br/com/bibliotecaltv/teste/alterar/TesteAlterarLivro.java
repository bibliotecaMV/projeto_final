package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.LivroDAO;

public class TesteAlterarLivro {

	public static void main(String[] args) throws Exception {
		LivroDAO daoLivro = new LivroDAO();
		Livro livro = daoLivro.listarPorId(Livro.class,"333");
		
		livro.setAutor("Thaynara");
		livro.setAno_editado(1985L);
		livro.setCDD("003");
		livro.setEditora("Gilmar");
		livro.setExemplares(40L);
		livro.setForma_aquisicao("comprado");
		livro.setLocal_edicao("Morro do macaco");
		livro.setTitulo("Iracema");
		livro.setVolume(4L);
		daoLivro.alterar(livro);

	}

}
