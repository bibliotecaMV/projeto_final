package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;
import br.com.bibliotecaltv.dao.LivroDAO;

public class TesteInserirLivro {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		LivroDAO daoLivro = new LivroDAO();
		
		String descricao_genero = "Romance";
		Long id_genero = dao.buscarIdGenero(descricao_genero, descricao_genero);
		Genero genero = dao.buscarGeneroPorId(id_genero);
		
		Livro livro = new Livro();
		livro.setTombo("333");
		livro.setCDD(genero.getSigla());
		livro.setGenero(genero);
		livro.setAno_editado(2017L);
		livro.setAutor("Pedro Lucas Oliveira de Matos");
		livro.setEditora("Eryka");
		livro.setExemplares(30L);
		livro.setForma_aquisicao("comprado");
		livro.setLocal_edicao("Dragão do Mar");
		livro.setTitulo("The Bad");
		livro.setVolume(1L);
		daoLivro.salvar(livro);
	}
}
