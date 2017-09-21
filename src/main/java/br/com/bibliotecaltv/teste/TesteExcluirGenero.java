package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.dao.GeneroDAO;

public class TesteExcluirGenero {

	public static void main(String[] args) {
		
		GeneroDAO dao = new GeneroDAO();
		dao.excluir(1L);
		
		/*AdministradorDAO dao  = new AdministradorDAO();
		Long id_genero = dao.buscarIdGenero("Romance");
		Genero genero = dao.buscarGeneroPorId(id_genero);
		dao.excluirGenero(genero);*/
	}
}
