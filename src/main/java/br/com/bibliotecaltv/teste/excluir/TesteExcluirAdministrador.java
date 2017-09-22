package br.com.bibliotecaltv.teste.excluir;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteExcluirAdministrador {

	public static void main(String[] args) throws Exception {
		AdministradorDAO dao = new AdministradorDAO();
		Administrador administrador = dao.listarPorId(Administrador.class, 1L); 
		dao.excluir(administrador);
	}

}
