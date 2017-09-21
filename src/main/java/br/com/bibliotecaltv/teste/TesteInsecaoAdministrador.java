package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInsecaoAdministrador {
	public static void main(String[] args) {
			AdministradorDAO dao = new AdministradorDAO();
			Administrador administrador = new Administrador();
			administrador.setUsuario("Mayk Lucas");
			administrador.setSenha("123456");
			dao.adicionarAdministrador(administrador);
	}
}
