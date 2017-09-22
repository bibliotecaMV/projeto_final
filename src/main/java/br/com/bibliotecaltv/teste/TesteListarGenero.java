package br.com.bibliotecaltv.teste;

import java.util.List;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.GeneroDAO;

public class TesteListarGenero {

	public static void main(String[] args) throws Exception {
		GeneroDAO dao = new GeneroDAO();
		List<Genero> generos = dao.listar(Genero.class);
		
		for(Genero genero: generos) {
			System.out.println(genero);
		}

	}

}
