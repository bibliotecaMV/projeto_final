package br.com.bibliotecaltv.teste.monitor;

import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarMonitoresPorIdM {
	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Monitores monitores = dao.buscarMonitorPorId(1L);
		System.out.println(monitores.getLogin());
	}
}
