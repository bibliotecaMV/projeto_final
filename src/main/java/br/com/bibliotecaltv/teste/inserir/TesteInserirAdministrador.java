package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInserirAdministrador {
	public static void main(String[] args) {

		AdministradorDAO dao = new AdministradorDAO();
		Administrador administrador = new Administrador();
		administrador.setUsuario("tapioca");
		administrador.setSenha("1234");
		dao.salvar(administrador);
	}
}
