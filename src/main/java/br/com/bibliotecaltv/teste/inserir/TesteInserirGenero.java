package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.GeneroDAO;

public class TesteInserirGenero {
	public static void main(String[] args) {
		
		Genero genero = new Genero();
		genero.setSigla("000");
		genero.setDescricao("Programação");
		
		GeneroDAO dao = new GeneroDAO(); 
		dao.salvar(genero);
		System.out.println("Inserindo com o novo método");
		
		/*AdministradorDAO dao = new AdministradorDAO();
		Genero genero = new Genero();
		genero.setDescricao("Romance");
		genero.setSigla("001");
		dao.adicionarGenero(genero);*/
	}
}
