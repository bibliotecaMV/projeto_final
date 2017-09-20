package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarTomboLivro {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		String titulo = "Iracema";
		String autor = "Thaynara";
		Long id_genero = dao.buscarIdGenero("Romance");
		String editora = "Gilmar";
		Long ano_editado = 1985L;
		Long volume = 4L;
		String forma_aquisicao = "comprado";
		Long exemplares = 40L;
		String tombo = dao.buscarTomboLivro(titulo, autor, id_genero, editora, ano_editado, volume,
				forma_aquisicao, exemplares);
		System.out.println(tombo);
	}
}
