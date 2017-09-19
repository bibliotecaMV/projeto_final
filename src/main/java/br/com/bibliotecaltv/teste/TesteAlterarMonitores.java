package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteAlterarMonitores {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Monitores monitores = dao.buscarMonitorPorId(1L);
		monitores.setLogin("renatorichard2012@gmail.com");
		monitores.setSenha("123456");
		dao.alterarMonitores(monitores);
	}

}
