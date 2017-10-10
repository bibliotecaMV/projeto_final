package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.GeneroDAO;

public class TesteInserirGenero {
	public static void main(String[] args) {
		Genero genero = new Genero();
		genero.setSigla("002");
		genero.setDescricao("Aventura");
		GeneroDAO dao = new GeneroDAO(); 
		dao.salvar(genero);
	}
}
