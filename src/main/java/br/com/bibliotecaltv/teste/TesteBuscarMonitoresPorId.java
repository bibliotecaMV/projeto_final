package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarMonitoresPorId {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Monitores monitores = dao.buscarMonitorPorId(1L);
		System.out.println(monitores.getLogin());
	}
}
