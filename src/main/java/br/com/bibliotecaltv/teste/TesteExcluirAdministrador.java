package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteExcluirAdministrador {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Long id_administrador = dao.buscarIdAdministrador("Renato", "123");
		Administrador administrador = dao.buscarAdministradorPorId(id_administrador); 
		dao.excluirAdministradores(administrador);
		System.out.println("Excluindo adm Renato feio");

	}

}
