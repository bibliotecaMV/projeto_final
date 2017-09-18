package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TestaAlterarAdministrador {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Administrador administrador = dao.buscarAdministradorPorId(1L);
		administrador.setSenha("1234");
		administrador.setUsuario("Pedro Lucas");
		dao.alterarAdministrador(administrador);

	}

}
