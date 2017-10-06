package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TestaAlterarAdministrador {

	public static void main(String[] args) throws Exception {
		AdministradorDAO dao = new AdministradorDAO();
		Administrador administrador = dao.listarPorId(Administrador.class, 5L);
		administrador.setSenha("1234");
		administrador.setUsuario("Richard");
		dao.alterar(administrador);

	}

}
