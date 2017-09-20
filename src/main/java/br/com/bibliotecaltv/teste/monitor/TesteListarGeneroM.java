package br.com.bibliotecaltv.teste.monitor;

import java.util.List;
import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.MonitoresDAO;

public class TesteListarGeneroM {

	public static void main(String[] args) {
		MonitoresDAO dao = new MonitoresDAO();
		List<Genero> generos = dao.listarGenero();
		
		for(Genero genero: generos) {
			System.out.println(genero);
		}

	}

}
