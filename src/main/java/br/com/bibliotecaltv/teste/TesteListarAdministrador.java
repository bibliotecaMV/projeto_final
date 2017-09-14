package br.com.bibliotecaltv.teste;

import java.util.List;
import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteListarAdministrador {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		List<Administrador> admin = dao.listarAdministrador();
		
		for(Administrador administrador: admin) {
			System.out.println(administrador);
		}

	}

}
