package br.com.bibliotecaltv.teste.alterar;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TestaAlterarAdministrador {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Administrador administrador = dao.buscarAdministradorPorId(2L);
		administrador.setUsuario("Carla Valéria");
		administrador.setSenha("13042000");
		dao.alterar(administrador);

	}

}
