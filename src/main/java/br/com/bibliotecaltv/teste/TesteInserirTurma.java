package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Turma;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInserirTurma {

	public static void main(String[] args) {
		
		AdministradorDAO dao = new AdministradorDAO();
		Turma turma = new Turma();
		turma.setNome("3A");
		dao.adicionarTurma(turma);
		System.out.println("Adicionando 3A");
		
		turma.setNome("2A");
		dao.adicionarTurma(turma);
		System.out.println("Adicionando 2A");
		
		turma.setNome("1A");
		dao.adicionarTurma(turma);
		System.out.println("Adicionando 1A");
		
		turma.setNome("3B");
		dao.adicionarTurma(turma);
		System.out.println("Adicionando 3B");
		
		turma.setNome("2B");
		dao.adicionarTurma(turma);
		System.out.println("Adicionando 2B");
		
		turma.setNome("1B");
		dao.adicionarTurma(turma);
		System.out.println("Adicionando 1B");
		
		turma.setNome("3C");
		dao.adicionarTurma(turma);
		System.out.println("Adicionando 3C");
		
		turma.setNome("2C");
		dao.adicionarTurma(turma);
		System.out.println("Adicionando 2C");
		
		turma.setNome("1C");
		dao.adicionarTurma(turma);
		System.out.println("Adicionando 1C");
		
	}

}
