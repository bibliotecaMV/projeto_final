package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.controller.javabeans.Livro;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInserirLivro {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		 
		String descricao_genero = "Romance";
		Long id_genero = dao.buscarIdGenero(descricao_genero, descricao_genero);
		Genero genero = dao.buscarGeneroPorId(id_genero);
		
		Livro livro = new Livro();
		livro.setTombo("3455545");
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
		dao.adicionarLivro(livro);
	}
}
