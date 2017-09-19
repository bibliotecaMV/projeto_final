package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarTomboLivro {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		String titulo = "The Love";
		String autor = "Kelmy";
		Long id_genero = dao.buscarIdGenero("Romance");
		String editora = "Eryka";
		Long ano_editado = 2000L;
		Long volume = 3L;
		String forma_aquisicao = "comprado";
		Long exemplares = 10L;
		String tombo = dao.buscarTomboLivro(titulo, autor, id_genero, editora, ano_editado, volume,
				forma_aquisicao, exemplares);
		System.out.println(tombo);
	}
}
