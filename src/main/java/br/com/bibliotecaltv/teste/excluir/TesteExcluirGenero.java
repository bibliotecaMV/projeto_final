package br.com.bibliotecaltv.teste.excluir;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.GeneroDAO;

/*import br.com.bibliotecaltv.dao.GeneroDAO;*/

public class TesteExcluirGenero {

	public static void main(String[] args) throws Exception {
		GeneroDAO dao = new GeneroDAO();
		Genero genero = dao.listarPorId(Genero.class, 1L);
		dao.excluir(genero);
	}
}
