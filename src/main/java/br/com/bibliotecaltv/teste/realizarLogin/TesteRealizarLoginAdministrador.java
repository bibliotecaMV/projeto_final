package br.com.bibliotecaltv.teste.realizarLogin;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteRealizarLoginAdministrador {
	public static void main(String[] args) throws Exception {
		AdministradorDAO dao = new AdministradorDAO();		
		Administrador administrador = dao.listarPorId(Administrador.class, 2L);
		boolean verifica = dao.realizarLogin("Administrador", administrador.getUsuario(), 
				administrador.getSenha());
		System.out.println(verifica);
	}
	
}
