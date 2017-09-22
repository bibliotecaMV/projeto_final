package br.com.bibliotecaltv.teste;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Monitores;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteListarMonitores {

	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		List<Monitores> monitores = dao.listar(Monitores.class);
		
		for(Monitores monitor: monitores) {
			System.out.println(monitor);
		}

	}

}
