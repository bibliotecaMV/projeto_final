package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Administrador;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInserir{
    
	public static void main(String[] args) {
		Administrador admin = new Administrador();
		admin.setUsuario("João");
		admin.setSenha("123456");
		
		AdministradorDAO dao = new AdministradorDAO();
		dao.inserirAdministrador(admin);
	}
}
