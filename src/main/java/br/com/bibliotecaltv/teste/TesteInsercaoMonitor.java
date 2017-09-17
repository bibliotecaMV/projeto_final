package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInsercaoMonitor {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Monitores monitores = new Monitores();
		monitores.setNome("Renato");
		monitores.setSenha("renatopereira");
		dao.adicionarMonitor(monitores);
	}
}
