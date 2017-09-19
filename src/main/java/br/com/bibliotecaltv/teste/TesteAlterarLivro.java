package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarLivro {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Livro livro = dao.buscarLivroPorTombo("1");
		livro.setAutor("Jose De Alencar");
		livro.setAno_editado(14/07/1985L);
		livro.setCDD("0000");
		livro.setEditora("mayk Das baixadas");
		livro.setExemplares(40L);
		livro.setForma_arquisicao("Comprado");
		livro.setLocal_edicao("Morro do macaco");
		livro.setTitulo("Iracema");
		livro.setTombo("34");
		livro.setVolume(4L);
		dao.alterarLivro(livro);

	}

}
