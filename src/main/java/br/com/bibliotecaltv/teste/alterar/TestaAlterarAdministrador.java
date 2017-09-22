package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TestaAlterarAdministrador {

	public static void main(String[] args) throws Exception {
		AdministradorDAO dao = new AdministradorDAO();
		Administrador administrador = dao.listarPorId(Administrador.class, 1L);
		administrador.setSenha("654321");
		administrador.setUsuario("Lucas Pedro");
		dao.alterar(administrador);

	}

}
