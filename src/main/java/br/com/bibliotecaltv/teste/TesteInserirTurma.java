package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInserirTurma {

	public static void main(String[] args) {
		
		AdministradorDAO dao = new AdministradorDAO();
		Turma turma = new Turma();
		
		turma.setTurma("3°A");
		dao.adicionar(turma);
		
		System.out.println("Adicionando turma");
		

	}

}
