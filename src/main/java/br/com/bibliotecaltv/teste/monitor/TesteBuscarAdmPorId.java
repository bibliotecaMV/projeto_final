package br.com.bibliotecaltv.teste.monitor;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteBuscarAdmPorId {

	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		Administrador adm = dao.buscarAdministradorPorId(1L);
		System.out.println(adm.getUsuario());

	}

}
