package br.com.bibliotecaltv.teste.listarPorId;

import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarMonitoresPorId {
	public static void main(String[] args) throws Exception {
		MonitoresDAO dao = new MonitoresDAO();
		Monitores monitores = dao.listarPorId(Monitores.class, 1L);
		System.out.println(monitores.getUsuario());
	}
}
