package br.com.bibliotecaltv.teste.monitor;


import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarTomboLivroM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
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
