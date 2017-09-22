package br.com.bibliotecaltv.teste.listarPorId;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteBuscarAdministradorPorId {
	public static void main(String[] args) throws Exception {
		AdministradorDAO dao = new AdministradorDAO();
		Administrador administrador = dao.listarPorId(Administrador.class, 2L);
		System.out.println(administrador.getUsuario());
	}
}
