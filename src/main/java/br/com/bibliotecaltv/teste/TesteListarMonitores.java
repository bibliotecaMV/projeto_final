package br.com.bibliotecaltv.teste;

import java.util.List;
import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteListarMonitores {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		List<Monitores> monitores = dao.listarMonitores();
		
		for(Monitores monitor: monitores) {
			System.out.println(monitor);
		}

	}

}
