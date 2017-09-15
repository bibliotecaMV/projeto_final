package br.com.bibliotecaltv.teste;

import br.com.bibliotecaltv.controller.javabeans.Professor;
import br.com.bibliotecaltv.dao.AdministradorDAO;

public class TesteInserirProfessor {
	public static void main(String[] args) {
		AdministradorDAO dao = new AdministradorDAO();
		Professor professor = new Professor();
		professor.setMatricula(3455545L);
		professor.setNomeCompleto("Pedro Lucas Oliveira de Matos");
		dao.adicionarProfessor(professor);
	}
}
