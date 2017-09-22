package br.com.bibliotecaltv.teste.excluir;


import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteExcluirMonitor {

	public static void main(String[] args) throws Exception {
		MonitoresDAO dao = new MonitoresDAO();
		Monitores monitores = dao.listarPorId(Monitores.class, 1L);
		dao.excluir(monitores);
	}

}
