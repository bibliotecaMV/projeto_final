package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarLivro {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Livro livro = dao.buscarLivroPorTombo("3455545");
		livro.setAutor("Thaynara");
		livro.setAno_editado(1985L);
		livro.setCDD("003");
		livro.setEditora("Gilmar");
		livro.setExemplares(40L);
		livro.setForma_aquisicao("comprado");
		livro.setLocal_edicao("Morro do macaco");
		livro.setTitulo("Iracema");
		livro.setVolume(4L);
		dao.alterarLivro(livro);

	}

}
