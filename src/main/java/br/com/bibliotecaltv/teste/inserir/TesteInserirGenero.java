package br.com.bibliotecaltv.teste.inserir;

import br.com.bibliotecaltv.controller.javabeans.Genero;
import br.com.bibliotecaltv.dao.GeneroDAO;

public class TesteInserirGenero {
	public static void main(String[] args) {
		GeneroDAO dao = new GeneroDAO(); 
		Genero genero = new Genero();
		genero.setSigla("002");
		genero.setDescricao("Programação");
		dao.salvar(genero);
		System.out.println("Salvando com o novo método");
		
		/*AdministradorDAO dao = new AdministradorDAO();
		Genero genero = new Genero();
		genero.setDescricao("Romance");
		genero.setSigla("001");
		dao.adicionarGenero(genero);*/
	}
}
