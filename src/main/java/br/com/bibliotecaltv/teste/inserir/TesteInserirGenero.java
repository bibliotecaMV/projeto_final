package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.GeneroDAO;

public class TesteInserirGenero {
	public static void main(String[] args) {
		GeneroDAO dao = new GeneroDAO(); 
		Genero genero = new Genero();
		genero.setSigla("002");
		genero.setDescricao("Programa��o");
		dao.salvar(genero);
	}
}
