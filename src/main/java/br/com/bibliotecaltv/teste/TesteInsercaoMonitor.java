package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInsercaoMonitor {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Monitores monitores = new Monitores();
		monitores.setNome("pedro");
		monitores.setSenha("1234");
		dao.adicionarMonitor(monitores);
	}
}
