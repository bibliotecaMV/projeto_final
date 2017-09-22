package br.com.bibliotecaltv.teste.listar;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteListarAdministrador {

	public static void main(String[] args) throws Exception {
		AdministradorDAO dao = new AdministradorDAO();
		List<Administrador> administradores = dao.listar(Administrador.class);
		
		for(Administrador administrador: administradores) {
			System.out.println(administrador);
		}

	}

}
