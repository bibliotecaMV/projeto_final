package br.com.bibliotecaltv.teste;

import java.util.List;
import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteListarGenero {

	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		List<Genero> generos = dao.listarGenero();
		
		for(Genero genero: generos) {
			System.out.println(genero);
		}

	}

}
